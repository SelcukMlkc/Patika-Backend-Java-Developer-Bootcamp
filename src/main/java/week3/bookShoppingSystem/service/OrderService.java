package week3.bookShoppingSystem.service;

import week3.bookShoppingSystem.model.Order;
import week3.bookShoppingSystem.model.Product;
import week3.bookShoppingSystem.model.User;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private static List<Order> orderList = new ArrayList<>();

    public void create (List<Product> productList, User user) {

        Order order = new Order(productList, user);
        orderList.add(order);
    }

    public void list() {
        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
