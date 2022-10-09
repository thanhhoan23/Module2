package productmanager;

import java.util.Set;

public class Table {
    private String name;
    private int idTable;
    private double total;
    public Set<OrderItem> orderItemSet;

    public Table() {}

    public Table(String name, double total, Set<OrderItem> orderItemSet) {
        this.name = name;
        this.total = total;
        this.orderItemSet = orderItemSet;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Set<OrderItem> getOrderItemSet() {
        return orderItemSet;
    }

    public void setOrderItemSet(Set<OrderItem> orderItemSet) {
        this.orderItemSet = orderItemSet;
    }
}
