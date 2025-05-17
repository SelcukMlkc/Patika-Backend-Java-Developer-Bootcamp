package week9project.model;

import week9project.model.enums.PaymentMethod;

import java.math.BigDecimal;

public class Payment extends BaseModel {

    private Order order;

    private PaymentMethod paymentMethod;

    private BigDecimal amount;

    public Payment(Order order, PaymentMethod paymentMethod, BigDecimal amount) {
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
