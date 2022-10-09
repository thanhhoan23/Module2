package productmanager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManagerTable {
private Set<Table> listTable;

public ManagerTable() {
    listTable = new HashSet<>();
}

    public Set<Table> getListTable() {
        return listTable;
    }

    public void setListTable(Set<Table> listTable) {
        this.listTable = listTable;
    }


    public void addOrder (int idTable, Product product,int amount) {
    OrderItem orderItem=new OrderItem(12,product,amount);
        for (Table table: listTable) {
            if (table.getIdTable() == idTable) {
                table.orderItemSet.add(orderItem);
            }
        }
    }
}
