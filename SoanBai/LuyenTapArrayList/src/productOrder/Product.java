package productOrder;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double price;
    private int amount;
    private String discription;
    private String urlImage;
    public Product() {}

    public Product(int id, String nameProduct, double price, int amount, String discription, String urlImage) {
        this.idProduct = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
        this.discription = discription;
        this.urlImage = urlImage;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    public void setProduct(Product product) {
        this.idProduct = product.getIdProduct();
        this.nameProduct = product.getNameProduct();
        this.price = product.getPrice();
        this.amount = product.getAmount();
        this.discription = product.getDiscription();
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", discription='" + discription + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
