package ua.com.juja.core.OOPAdvanced.Library.SearchOfIssuingsWithTheNumberOfPagesIsMoreThanN;

public class Library {

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        String info = "";


        if (catalog.length == 0) {
            return "";
        } else {
            for (int i = 0; i < catalog.length; i++) {
                if (catalog[i].getCountPages() > barrierCountPages) {
                    info += catalog[i].toPrint();
                }
                System.out.println(info);

            }
        }
        return info;
    }

}
