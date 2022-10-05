package productManager;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private int phone;
    private String email;

    public  Customer(){}

    public Customer(int id, String name, int phone, String email) {
        this.idCustomer = id;
        this.nameCustomer = name;
        this.phone = phone;
        this.email = email;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
