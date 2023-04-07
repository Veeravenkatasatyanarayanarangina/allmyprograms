package motivity.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
    private String shop_name;
    private List<Book> bookList=  new ArrayList<>();
    public BookShop() {
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public void includerecord()
    {
        for (int i=1;i<=10;i++)
        {
            Book book = new Book();
            book.setBook_id(i);
            book.setBook_name("book - "+i);
            getBookList().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shop_name='" + shop_name + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
