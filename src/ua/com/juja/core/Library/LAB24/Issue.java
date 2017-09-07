package ua.com.juja.core.Library.LAB24;

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


 