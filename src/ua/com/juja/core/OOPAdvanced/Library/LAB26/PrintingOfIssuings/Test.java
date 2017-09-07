package ua.com.juja.core.OOPAdvanced.Library.LAB26.PrintingOfIssuings;

public class Test{
    public static void main(String[] args) {

        Library library = new Library();

        Issue[] arrayIssue = new Issue[0];

        String actualPrintCatalog = library.printCatalog(arrayIssue);

        //check
        if (actualPrintCatalog == null)
            throw new AssertionError("Result cannot be null");

        if (actualPrintCatalog.isEmpty())
            System.out.print("OK");
        else
            throw new AssertionError("Expected  empty string but found " + actualPrintCatalog);
    }

}