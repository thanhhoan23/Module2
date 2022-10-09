package productmanager;

public class Product {
    private String nameProduct;
    private double price;
    private int idProduct;

    public Product() {}

    public Product(String name, double price, int id) {
        this.nameProduct = name;
        this.price = price;
        this.idProduct = id;
    }
    public Product(String name, double price) {
        this.nameProduct = name;
        this.price = price;
    }
    public Product(String name) {
        this.nameProduct = name;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + nameProduct + '\'' +
                ", price=" + price +
                ", id=" + idProduct +
                '}';
    }
}
