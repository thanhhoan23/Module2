package productManager;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getNameProduct().compareToIgnoreCase(product2.getNameProduct()) > 0) {
            return 1;
        } else if (product1.getNameProduct().compareToIgnoreCase(product2.getNameProduct()) < 0) {
            return -1;
        } else {
            if (product1.getPrice() < product2.getPrice()) {
                return -1;
            } else if (product1.getPrice() > product2.getPrice()) {
                return 1;
            } else {
                if (product1.getAmount() > product2.getAmount()) {
                    return 1;
                } else if (product1.getAmount() < product2.getAmount()) {
                    return -1;
                }
            }
            return 0;
        }
    }
}
