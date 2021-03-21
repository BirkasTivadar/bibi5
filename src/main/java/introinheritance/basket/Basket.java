package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return List.copyOf(items);
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item most not be null.");
        }
        items.add(item);
    }

    private boolean isEmptyOrNull(String str) {
        return str == null || str.isBlank();
    }

    public void removeItem(String barcode) {
        if (isEmptyOrNull(barcode)) {
            throw new IllegalArgumentException("Barcode most not be empty.");
        }
        Item findItem = null;
        for (Item item : items) {
            if (item.getBarcode().equals(barcode)) {
                findItem = item;
            }
        }
        items.remove(findItem);
    }

    public void clearBasket() {
        items.clear();
    }

}
