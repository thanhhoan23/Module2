package productOrder;

import java.util.ArrayList;

public class Order {
    private int idOrder;
    private Customer customer;
    private ArrayList<Product> lisProduct;

    public Order() {}

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getLisProduct() {
        return lisProduct;
    }

    public void setLisProduct(ArrayList<Product> lisProduct) {
        this.lisProduct = lisProduct;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", customer=" + customer +
                ", lisProduct=" + lisProduct +
                '}';
    }
    //Câu 1: Viêt hàm tính tổng tiền của order

    public double getTotal () {
        int total = 0;
        for (int  i =0; i<lisProduct.size(); i++) {
            total += lisProduct.get(i).getPrice()* lisProduct.get(i).getAmount();
        }
        return total;
    }


    //Câu 2: Xóa sản phẩm khỏi danh sách theo id
    public void removeProductById (int id) {
        for (int  i =0; i< lisProduct.size(); i++) {
            if (lisProduct.get(i).getIdProduct() == id) {
                lisProduct.remove(i);
            }
        }
    }

//    
}
