package task.collection;

import java.util.ArrayList;
import java.util.List;


public class Order {
    // TODO: Учет заказов:
    //  Создайте класс Order с полями id, customer и totalAmount.
    //  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
    //  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.
    private int id;
    private String customer;
    private int totalAmount;

    public Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;

    }

    public static void printOrdersWithHighestTotalAmount(List<Order> Orders) {
        int maxTotalAmount = Integer.MIN_VALUE;
        for (Order order : Orders) {
            if (order.totalAmount > maxTotalAmount) {
                maxTotalAmount = order.totalAmount;
            }
        }
        for (Order order : Orders) {
            if (order.totalAmount == maxTotalAmount) {
                System.out.println("Order ID: " + order.id + ", Customer: " + order.customer + ", Total Amount: " + order.totalAmount);
            }
        }
    }

    public static int sumTotalAmount(List<Order> orders) {
        int sumTotalAmount = 0;
        for (Order order : orders) {
            sumTotalAmount += order.totalAmount;
        }
        return sumTotalAmount;
    }
}
