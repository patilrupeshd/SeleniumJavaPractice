package api.pojo;

import java.time.LocalDate;
import java.util.List;

public class Purchase {
    private String order_id;
    private LocalDate order_date;
    private String status;
    public String getOrder_id() {
        return order_id;
    }
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
    public LocalDate getOrder_date() {
        return order_date;
    }
    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    private double total_amount;
    private List<Item> items;
}
