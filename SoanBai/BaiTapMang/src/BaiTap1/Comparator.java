package BaiTap1;

import java.util.Comparator;

public class ComparatorC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getName().compareTo(o2.getName()) >0) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }

}
