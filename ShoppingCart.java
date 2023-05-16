import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Book> items;

    public void addItem(Book book){
        items.add(book);
    }

    public void removeItem(Book book){
        items.remove(book);
    }

    public void updateQuantity(Book book, int quantity){
        items.get(items.indexOf(book))
    }
}
