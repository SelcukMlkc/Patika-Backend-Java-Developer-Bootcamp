package week3.bookShoppingSystem.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productList;

    private OrderStatus orderStatus;

    private User user;

    private LocalDateTime createdDate;

    private LocalDateTime cancelDate;

    private Double total;

    public Order(List<Product> productList, User user) {
        this.orderStatus = OrderStatus.PREPARING;
        this.productList = productList;
        this.user = user;
        this.createdDate = LocalDateTime.now();
        this.cancelDate = null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getTotal() {
        double total = 0;

        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;

    }

    public void cancelOrder(Order order) {

        order.setOrderStatus(OrderStatus.CANCELED);
        order.cancelDate = LocalDateTime.now();

    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", orderStatus=" + orderStatus +
                ", user=" + user +
                ", createdDate=" + createdDate +
                ", cancelDate=" + cancelDate +
                ", total=" + getTotal() +
                '}';
    }
}
