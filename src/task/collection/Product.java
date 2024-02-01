package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Product {
    // TODO: Учет товаров на складе:
    //  Создайте класс Product с полями id, name и quantity.
    //  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
    //  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.
    int id;
    String name;
    int quantity;
    public Product(int id,String name, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        List<Product> Products = new ArrayList<>();
        Products.add(new Product(1,"Oil",0));
        Products.add(new Product(2,"Milk",68));
        Products.add(new Product(3,"Chocolate",100));
        Products.add(new Product(4,"Potato",1500));
        printZeroQuantity(Products);
        totalQuantity(Products);
        System.out.println(totalQuantity(Products));





    }
    public static void printZeroQuantity(List<Product> Products){
        for (Product product : Products){
            if (product.quantity == 0){
                System.out.println(product.id+ " " + product.name+ " " + product.quantity);
            }
        }
    }
    public static int totalQuantity(List<Product> Products){
        int total = 0;
        for (Product product : Products){
            total +=product.quantity;
        }
        return total;
    }
}
