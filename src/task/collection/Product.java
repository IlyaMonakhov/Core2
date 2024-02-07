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
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Oil",0));
        products.add(new Product(2,"Milk",68));
        products.add(new Product(3,"Chocolate",100));
        products.add(new Product(4,"Potato",1500));
        printProductsWithZeroQuantity(products);
        totalQuantity(products);
        System.out.println(totalQuantity(products));





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
