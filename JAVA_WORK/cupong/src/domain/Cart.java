package domain;

public class Cart {

    //PK
    private int cart_id;
    //FK
    private int member_id;

    public Cart(int cart_id, int member_id) {
        this.cart_id = cart_id;
        this.member_id = member_id;
    }

    public int getCart_id() {
        return cart_id;
    }
    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getMember_id() {
        return member_id;
    }
    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart_id=" + cart_id +
                ", member_id=" + member_id +
                '}';
    }
}