package inheritanceattributes.order;

import inheritanceattributes.book.Book;

public class ShippedBook extends Book {

    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        return purchase(pieces) + shippingCost;
    }

    @Override
    public String toString() {
        return String.format("%s:%d - %d", getTitle(), price, shippingCost);
    }
}
