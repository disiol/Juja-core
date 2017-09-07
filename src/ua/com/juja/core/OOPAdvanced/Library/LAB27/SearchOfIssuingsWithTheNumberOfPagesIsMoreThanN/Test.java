package ua.com.juja.core.OOPAdvanced.Library.LAB27.SearchOfIssuingsWithTheNumberOfPagesIsMoreThanN;

public class Test {
    public static void main(String[] args) {

        int countPages1 = -3;
        int countPages2 = 50;
        int countPages3 = 0;
        int countPages4 = 3;

        String testNameIssue1 = "TestNameIssue1";
        String testNameIssue2 = "TestNameIssue2";
        String testNameIssue3 = "TestNameIssue3";
        String testNameIssue4 = "TestNameIssue4";

        Library library = new Library();

        Issue[] arrayIssue = new Issue[4];

        arrayIssue[0] = new Issue(testNameIssue1, countPages1);
        arrayIssue[1] = new Issue(testNameIssue2, countPages2);
        arrayIssue[2] = new Issue(testNameIssue3, countPages3);
        arrayIssue[3] = new Issue(testNameIssue4, countPages4);

        String actualPrint = library.getIssueWithCountPagesMoreN(arrayIssue, 50);

        //check
        if (actualPrint == null)
            throw new AssertionError("Result cannot be null");

        if (actualPrint.isEmpty())
            System.out.print("OK");
        else
            throw new AssertionError("Expected empty string but found " + actualPrint);

    }

}