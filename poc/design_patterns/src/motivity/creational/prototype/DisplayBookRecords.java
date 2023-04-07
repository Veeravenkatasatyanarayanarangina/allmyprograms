package motivity.creational.prototype;

public class DisplayBookRecords
{
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop book = new BookShop();
        book.setShop_name("satya-books");

        book.includerecord();
        book.getBookList().remove(2);
        System.out.println(book);

        BookShop book1  = (BookShop) book.clone();
        book1.setShop_name("veera....");

        System.out.println(book1);
    }
}
