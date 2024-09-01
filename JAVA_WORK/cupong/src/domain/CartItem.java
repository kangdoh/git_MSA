package domain;

public class CartItem {

    // PK
    private int cart_item_id;
    // FK
    private int cart_id;
    private int item_id;
    // NM
    private int total_price;
    private int count;

    public CartItem(int cart_item_id, int cart_id, int item_id, int total_price, int count) {
        this.cart_item_id = cart_item_id;
        this.cart_id = cart_id;
        this.item_id = item_id;
        this.total_price = total_price;
        this.count = count;
    }

    public int getCart_item_id() {
        return cart_item_id;
    }
    public void setCart_item_id(int cart_item_id) {
        this.cart_item_id = cart_item_id;
    }

    public int getCart_id() {
        return cart_id;
    }
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getTotal_price() {
        return total_price;
    }
    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cart_item_id=" + cart_item_id +
                ", cart_id=" + cart_id +
                ", item_id=" + item_id +
                ", total_price=" + total_price +
                ", count=" + count +
                '}';
    }
}