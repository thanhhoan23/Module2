package productManager;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double price;
    private int amount;
    private String description;
    private String urlImage;
    private String sortDescription;

    public Product() {}

    public Product(int id, String name, double price, int amount) {
        this.idProduct = id;
        this.nameProduct = name;
        this.price = price;
        this.amount = amount;
    }

    public Product(int idProduct, String nameProduct, double price, int amount, String description, String urlImage, String sortDescription) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.urlImage = urlImage;
        this.sortDescription = sortDescription;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", sortDescription='" + sortDescription + '\'' +
                '}' + "\n";
    }
}
