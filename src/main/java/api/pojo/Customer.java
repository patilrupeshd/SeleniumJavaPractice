package api.pojo;

import java.util.List;

public class Customer {
    private String customer_id;
    private String name;
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Purchase> getPurchase_history() {
        return purchase_history;
    }
    public void setPurchase_history(List<Purchase> purchase_history) {
        this.purchase_history = purchase_history;
    }
    private String email;
    private List<Purchase> purchase_history;
}
