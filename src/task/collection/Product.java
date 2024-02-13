package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Product {
    // TODO: Учет товаров на складе:
    //  Создайте класс Product с полями id, name и quantity.
    //  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
    //  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.
    private int id;
    private String name;
    private int quantity;
    public Product(int id,String name, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public static void printProductsWithZeroQuantity(List<Product> products){
        for (Product product : products){
            if (product.quantity == 0){
                System.out.println(product.id+ " " + product.name+ " " + product.quantity);
            }
        }
    }
    public static int totalQuantity(List<Product> products){
        int total = 0;
        for (Product product : products){
            total +=product.quantity;
        }
        return total;
    }
}
