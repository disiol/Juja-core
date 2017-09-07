package ua.com.juja.core.OOPAdvanced.Library.LAB24.Book;

/**
 * Created by Denis Oleynyk on 07.09.17.
 * mail: deoniisii@gmail.com
 */


class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;

    }

    @Override
    public String toPrint() {
        return "Book"+"{"+super.toPrint() + ",author="+ authorBook +"}";
    }


//    public static void main(String[] args) {
//        String testNameBook = "TestNameBook";
//        String testAuthorBook = "TestBookAuthor";
//        int countPages = 100;
//        Issue book = new Book(testNameBook, countPages, testAuthorBook);
//
//       String actualBookPrint = book.toPrint();
//        System.out.println(actualBookPrint);
//    }

}