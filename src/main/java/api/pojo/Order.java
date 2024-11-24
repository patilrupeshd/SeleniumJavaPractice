package api.pojo;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private String order_id;
    private String customer_id;
    public String getOrder_id() {
        return order_id;
    }
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
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
    public Address getShipping_address() {
        return shipping_address;
    }
    public void setShipping_address(Address shipping_address) {
        this.shipping_address = shipping_address;
    }
    public PaymentMethod getPayment_method() {
        return payment_method;
    }
    public void setPayment_method(PaymentMethod payment_method) {
        this.payment_method = payment_method;
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
    private LocalDate order_date;
    private String status;
    private Address shipping_address;
    private PaymentMethod payment_method;
    private double total_amount;
    private List<Item> items;
}
