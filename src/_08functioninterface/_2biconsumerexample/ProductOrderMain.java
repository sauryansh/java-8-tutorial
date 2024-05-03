package _08functioninterface._2biconsumerexample;

import _00utility.Order;
import _00utility.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class ProductOrderMain {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(new Product("Laptop", 1000), 2));
        orders.add(new Order(new Product("Phone", 500), 3));
        orders.add(new Order(new Product("Tablet", 300), 1));

        final BiConsumer<Order, Double> productOrderDetails = getOrderDoubleBiConsumer();

        for (Order order : orders) {
            productOrderDetails.accept(order, order.getProduct().getPrice());
        }

    }

    private static BiConsumer<Order, Double> getOrderDoubleBiConsumer() {
        BiConsumer<Order, Double> calculateTotalPrice = (order, totalPrice) -> {
            System.out.println("Order: " + order.getProduct().getName() + ", Quantity: " + order.getQuantity() + ", Total Price: " + totalPrice);
        };

        BiConsumer<Order, Double> sendNotification = (order, totalPrice) -> {
            System.out.println("Notification sent for order: " + order.getProduct().getName() + ", Total Price: " + totalPrice);
        };

        return calculateTotalPrice.andThen(sendNotification);
    }
}
