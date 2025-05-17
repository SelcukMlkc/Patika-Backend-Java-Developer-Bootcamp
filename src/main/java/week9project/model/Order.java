package week9project.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order extends BaseModel {


    private Customer customer;

    private BigDecimal totalAmount;

    private LocalDateTime orderDate;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderDate = LocalDateTime.now();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
