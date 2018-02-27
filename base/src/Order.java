import java.util.List;

/**
 * Created by Svetlana on 27.02.2018.
 */
public class Order {

    private long id;
    private List<Item> cart;

    public Order(long id, List<Item> cart) {
        this.id = id;
        this.cart = cart;
    }
}
