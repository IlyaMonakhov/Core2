package task.collection;

import java.util.*;
import java.util.Map;

import static task.collection.Order.printOrdersWithHighestTotalAmount;
import static task.collection.Order.sumTotalAmount;
import static task.collection.Product.printProductsWithZeroQuantity;
import static task.collection.Product.totalQuantity;
import static task.collection.Student.listMaxAgeStudent;
import static task.collection.Student.printListStudents;
import static task.collection.StudentSecond.averageAttendance;
import static task.collection.StudentSecond.minAttendance;
import static task.collection.Task.getTasksWithSpecificTitle;
import static task.collection.Task.printUnfinishedTasks;


public class Collection {
    public static void main(String[] args) {

        maxNumbers();
        System.out.println(maxNumbers());

        removeDuplicates();

        sortDescendingOrder();

        сheckElement();

        intersection();

        recurringRemoval();

        checkKey();

        getValues();

        removeMapNames();

        addElementStack();

        popElementStack();

        сheckStack();


        List<Order> Orders = new ArrayList<>();
        Orders.add(new Order(1, "Ilya", 100));
        Orders.add(new Order(2, "Nikita", 200));
        Orders.add(new Order(3, "Ivan", 150));
        Orders.add(new Order(4,"Misha",5000));

        printOrdersWithHighestTotalAmount(Orders);

        int totalAmount = sumTotalAmount(Orders);
        System.out.println("Total amount of all orders: " + totalAmount);



        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Oil",0));
        products.add(new Product(2,"Milk",68));
        products.add(new Product(3,"Chocolate",100));
        products.add(new Product(4,"Potato",1500));
        printProductsWithZeroQuantity(products);
        totalQuantity(products);
        System.out.println(totalQuantity(products));


        List<Student> students = new ArrayList<>();
        students.add(new Student("Masha", 25));
        students.add(new Student("Egor",30));
        students.add(new Student("Zaur",24));
        students.add(new Student("Marina",23));
        printListStudents(students);
        System.out.println("    ");

        int minAge = 26;

        listMaxAgeStudent(students,minAge);
        System.out.println("Возраст больше 26");

        List<Student> maxAgeStudents = listMaxAgeStudent(students, minAge);
        for (Student student : maxAgeStudents) {
            System.out.println(student.name + student.age);
        }


        List<StudentSecond> studentSecondList = new ArrayList<>();
        studentSecondList.add(new StudentSecond("Alina", 20));
        studentSecondList.add(new StudentSecond("Alibaba", 78));
        studentSecondList.add(new StudentSecond("Bob", 50));
        studentSecondList.add(new StudentSecond("Join", 100));
        minAttendance(studentSecondList);
        averageAttendance(studentSecondList);
        System.out.println(averageAttendance(studentSecondList));




        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1,"Сложение","Выполнена"));
        tasks.add(new Task(2,"Вычитание","Не выполнена"));
        tasks.add(new Task(1,"Умножение","Выполнена"));

        printUnfinishedTasks(tasks);

        String title = "Умножение";
        System.out.println("    ");

        getTasksWithSpecificTitle(tasks,title);
        System.out.println(getTasksWithSpecificTitle(tasks,title));


    }
//    public static void printOrdersWithHighestTotalAmount(List<Order> Orders) {
//        int maxTotalAmount = Integer.MIN_VALUE;
//        for (Order order : Orders) {
//            if (order.totalAmount > maxTotalAmount) {
//                maxTotalAmount = order.totalAmount;
//            }
//        }
//        for (Order order : Orders) {
//            if (order.totalAmount == maxTotalAmount) {
//                System.out.println("Order ID: " + order.id + ", Customer: " + order.customer + ", Total Amount: " + order.totalAmount);
//            }
//        }
//    }

    // Реализуйте функциональность согласно описанию

    // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов

    // TODO: Найти наибольший элемент в списке.

    public static int maxNumbers() {
        List<Integer> listNumber;
        listNumber = List.of(12,55,33,33,33,22,46);
        int max = Integer.MIN_VALUE;
        for (int number : listNumber) {
            if (number > max) {
                max = number;
            }
        }
        return max;

    }

    // TODO: Удалить все дубликаты из списка.
    public static void removeDuplicates() {
        List<Integer> listNumber;
        listNumber = List.of(12,55,33,33,33,22,46);
        Set<Integer> setNumber = new HashSet<>();
        setNumber.addAll(listNumber);
        System.out.println(setNumber);

    }

    // TODO: Отсортировать список в порядке убывания.
    public static void sortDescendingOrder() {
        List<Integer> listNumber;
        listNumber = List.of(12,55,33,33,33,22,46);
        listNumber.sort(Collections.reverseOrder());
        System.out.println(listNumber);
    }

    // TODO: Проверить, содержит ли множество определенный элемент.
    public static boolean сheckElement() {
        Set<String> setNamesFirst = new HashSet<>();
        setNamesFirst = Set.of("Zaur","Marina","Igor","Misha");
        String checkingName = "Zaur";
        return setNamesFirst.contains(checkingName);
    }

    // TODO: Найти пересечение двух множеств.
    public static boolean intersection() {
        Set<String> setNamesFirst = new HashSet<>();
        setNamesFirst = Set.of("Zaur","Marina","Igor","Misha");
        Set<String> setNamesSecond = new HashSet<>();
        setNamesSecond = Set.of("Ilya","Igor","Denis");

        return setNamesSecond.retainAll(setNamesFirst);
    }

    // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
    public static void recurringRemoval() {
        Set<String> setNamesFirst = new HashSet<>();
        setNamesFirst = Set.of("Zaur","Marina","Igor","Misha");
        Set<String> setNamesSecond = new HashSet<>();
        setNamesSecond = Set.of("Ilya","Igor","Denis");
        setNamesFirst.removeAll(setNamesSecond);
    }

    // TODO: Проверить, содержит ли карта определенный ключ.
    public static boolean checkKey() {
        Map<Integer,String> mapNames = new HashMap<>();
        mapNames.put(125, "Ivan");
        mapNames.put(458, "Ilya");
        mapNames.put(555, "Igor");
        mapNames.put(666, "Egor");
        mapNames.put(777, "Masha");
        int key = 555;

        return mapNames.containsKey(key);
    }

    // TODO: Получить все значения, связанные с определенным ключом.
    public static void getValues() {
        Map<Integer, String> mapNames = new HashMap<>();
        mapNames.put(125, "Ivan");
        mapNames.put(458, "Ilya");
        mapNames.put(555, "Igor");
        mapNames.put(666, "Egor");
        mapNames.put(777, "Masha");
        int key = 555;
        if (mapNames.containsKey(key)) {
            System.out.println(mapNames.get(key));
        } else {
            System.out.println("Значение для ключа не найдены " + key);
        }
    }

    // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
    public static void removeMapNames() {
        int key2 = 777;
        Map<Integer, String> mapNames = new HashMap<>();
        mapNames.put(125, "Ivan");
        mapNames.put(458, "Ilya");
        mapNames.put(555, "Igor");
        mapNames.put(666, "Egor");
        mapNames.put(777, "Masha");
        mapNames.remove(key2);
    }

    // TODO: Добавить элемент в очередь.
    public static void addElementStack() {
        Stack<String> details = new Stack<>();
        details.push("engine");
        details.push("wheel");
        details.push("mirror");
        details.push("pin");
        String elementCar = "brakes";
        details.push(elementCar);
        System.out.println(details);
    }

    // TODO: Получить и удалить первый элемент из очереди.
    public static void popElementStack() {
        Stack<String> details = new Stack<>();
        details.push("engine");
        details.push("wheel");
        details.push("mirror");
        details.push("pin");
        details.pop();
        System.out.println(details);
    }

    // TODO: Проверить, пуста ли очередь.
    public static boolean сheckStack() {
        Stack<String> details = new Stack<>();
        details.push("engine");
        details.push("wheel");
        details.push("mirror");
        details.push("pin");
        return details.isEmpty();
    }
}

// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.


// TODO: Управление задачами:
//  Создайте класс Task с полями id, title и completed.
//  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.

// TODO: Создание списка студентов:
//  Создайте класс Student с полями name и age.
//  Создайте метод, который будет принимать список студентов и выводить их на экран.
//  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.

// TODO: Учет товаров на складе:
//  Создайте класс Product с полями id, name и quantity.
//  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
//  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name и attendance.
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
