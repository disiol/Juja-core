package ua.com.juja.core.OOPAdvanced.Library.Journal;

/**
 * Created by Denis Oleynyk on 07.09.17.
 * mail: deoniisii@gmail.com
 */
public class Issue {
    private String name;
    private int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return "name=" + name +
                ",countPages=" + countPages;
    }

}

class Journal extends Issue {
    private String yearJournal;
    private String numberJournal;


    public Journal(String name, int countPages, String testYearJournal, String testNumberJournal) {
        super(name, countPages);
        this.yearJournal = testYearJournal;
        this.numberJournal = testNumberJournal;
    }

    @Override
    public String toPrint() {
        return "Journal{" + super.toPrint() +
                ",year=" + yearJournal +
                ",number=" + numberJournal +
                "}";
    }


}