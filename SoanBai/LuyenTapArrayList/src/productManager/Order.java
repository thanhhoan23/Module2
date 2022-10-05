package productManager;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Comparator;

public class Order  {
    private int idOrder;
    private Customer customer;
    ArrayList<Product> listProduct;
    public Order(){}

    public  Order(int idOrder, Customer customer, ArrayList<Product> listProduct) {
        this.idOrder = idOrder;
        this.customer = customer;
        this.listProduct = listProduct;
    }

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

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", customer=" + customer + "\n" +
                ", listProduct=" + listProduct +
                '}';
    }

    //    1. Viet tinh tong tien order
    public double getTotal() {
        double total =0;
        for (int i = 0; i < listProduct.size(); i++) {
            total += listProduct.get(i).getPrice() * listProduct.get(i).getAmount();
        }
        return total;
    }

//    2. Xoa san pham khoi danh sach theo id

    public void removeProductById(int index) {
        for (int  i=0; i< listProduct.size(); i++) {
            if (listProduct.get(i).getIdProduct() == index) {
                listProduct.remove(index);


//                Xóa tìm đến id bất kì
//                listProduct.remove(listProduct.get(i));
            }
        }
    }

//3 . Sửa tên sản phẩm theo id
    public void changeProductById (int id, String name){
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getIdProduct() == id) {
                listProduct.get(i).setNameProduct(name);
            }
        }
    }

//    4. Tìm sản phẩm ở vị trí index theo tên sản phẩm cách1:
    public Product searchProductByName (String name) {
        int index = -1;
        for (int  i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getNameProduct().equalsIgnoreCase(name)) {
                index = i;
            }
        }
        if (index == -1) {
            return  null;
        }
        return listProduct.get(index);
    }

//    4. Tìm sản phẩm ở vị trí index theo tên sản phẩm cách 2:
    public Product search(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getNameProduct().toLowerCase().contains(name.toLowerCase())) {
                return listProduct.get(i);
            }
        }
        return null;
    }
//    5.Tìm sản phẩm theo tên sản phẩm và mô tả
    public Product searchProduct (String name, String description) {
        for (int i =0; i< listProduct.size(); i++ ) {
            if (listProduct.get(i).getNameProduct().toLowerCase().contains(name.toLowerCase()) ||
            listProduct.get(i).getDescription().toLowerCase().contains(description.toLowerCase())) {
                return listProduct.get(i);
            }
        } return null;
    }

//    6. Sắp xếp sản phẩm theo thứ tự từ a-z, giá tiền, số lượng

    public void arrangeProduct () {
        listProduct.sort(new ComparatorImpl());

//    public void arrangeProduct (Comparator <Product> comparator) {
//        for (int  i= 0; i<listProduct.size(); i++) {
//            for (int j = listProduct.size() - 1; j>i; j--) {
//                if (comparator.compare(listProduct.get(j-1), listProduct.get(j)) == 1) {
//                    Product temp = listProduct.get(j);
//                    listProduct.set(j, listProduct.get(j -1));
//                    listProduct.set (j-1, temp);
//                }
//            }
//        }
    }
//
//    public static void bubbleSort(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = array.length - 1; j > i; j--)
//                if (array[j] < array[j - 1]) {
//                    int temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;

// 7.    In ra Hóa đơn theo định dạng
}
