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
        ArrayList<Integer> listNumber = new ArrayList<>();
        // todo вообще корректнее будет писать
        List<Integer> listNbrs = new ArrayList<>(); // вспоминаем полиморфизм
        // Так же у листа есть мега удобный и приятный метод
        listNbrs = List.of(1, 2, 3); // всё в одну строчку - коротко и ясно
        listNumber.add(12);
        listNumber.add(55);
        listNumber.add(33);
        listNumber.add(33);
        listNumber.add(22);
        listNumber.add(46);
        System.out.println(maxNumbers(listNumber));
        removeDuplicates(listNumber);

        sortDescendingOrder(listNumber);
        System.out.println(listNumber);

        Set<String> setNamesFirst = new HashSet<>();
        // Set.of
        Set.of("test");
        setNamesFirst.add("Zaur");
        setNamesFirst.add("Marina");
        setNamesFirst.add("Igor");
        setNamesFirst.add("Misha");

        String checkingName = "Zaur";
        сheckElement(setNamesFirst , checkingName);
        System.out.println(setNamesFirst.contains("Zaur"));

        Set<String> setNamesSecond = new HashSet<>();
        setNamesSecond.add("Ilya");
        setNamesSecond.add("Egor");
        setNamesSecond.add("Denis");
        System.out.println(intersection(setNamesFirst, setNamesSecond));
        Map<Integer, String> mapNames = new HashMap<>();
        mapNames.put(125, "Ivan");
        mapNames.put(458, "Ilya");
        mapNames.put(555, "Igor");
        mapNames.put(666, "Egor");
        mapNames.put(777, "Masha");
        System.out.println(mapNames.containsKey(666));
        int key = 555;
        int key2 = 777;

        getValues(mapNames, key);
        System.out.println(mapNames.get(666));

        removeMapNames(mapNames, key2);
        System.out.println(mapNames);

        Stack<String> details = new Stack<>();
        details.push("engine");
        details.push("wheel");
        details.push("mirror");
        details.push("pin");

        System.out.println(details);

        String elementCar = "brakes";
        addElementStack(details,elementCar);

        System.out.println(details);
        popElementStack(details);

        System.out.println(details);
        сheckStack(details);

        System.out.println(details.isEmpty());


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

    // Реализуйте функциональность согласно описанию

    // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов

    // TODO: Найти наибольший элемент в списке.

    public static int maxNumbers(ArrayList<Integer> ListNumber) {
        int max = Integer.MIN_VALUE;
        for (int number : ListNumber) {
            if (number > max) {
                max = number;
            }
        }
        return max;

    }

    // TODO: Удалить все дубликаты из списка.
    public static void removeDuplicates(ArrayList<Integer> listNumber) {
        Set<Integer> setNumber = new HashSet<>();
        setNumber.addAll(listNumber);
        System.out.println(setNumber);

    }

    // TODO: Отсортировать список в порядке убывания.
    public static ArrayList<Integer> sortDescendingOrder(ArrayList<Integer> listNumber) {
        Collections.sort(listNumber, Collections.reverseOrder());
        // вот так тоже можно listNumber.sort(Collections.reverseOrder());
        // логично сделать метод войд и не возвращать ничего ибо сортируешь по ссылке
        return listNumber;
    }

    // TODO: Проверить, содержит ли множество определенный элемент.
    public static boolean сheckElement(Set<String> setNamesFirst,String checkingName) {
        return setNamesFirst.contains(checkingName);
    }

    // TODO: Найти пересечение двух множеств.
    public static boolean intersection(Set<String> setNamesFirst, Set<String> setNamesSecond) {
        return setNamesSecond.retainAll(setNamesFirst);
    }

    // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
    public static void recurringRemoval(Set<String> setNamesFirst, Set<String> setNamesSecond) {
        setNamesFirst.removeAll(setNamesSecond);
    }

    // TODO: Проверить, содержит ли карта определенный ключ.
    // todo: логичнее назвать checkKey
    public static boolean сheckingKey(Map<Integer, String> mapNames, int key) {
        return mapNames.containsKey(key);
    }

    // TODO: Получить все значения, связанные с определенным ключом.
    public static void getValues(Map<Integer, String> mapNames, int key) {
        if (mapNames.containsKey(key)) {
            System.out.println(mapNames.get(key));
        } else {
            System.out.println("Значение для ключа не найдены " + key);
        }
    }

    // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
    public static void removeMapNames(Map<Integer, String> mapNames, int key2) {
        mapNames.remove(key2);
    }

    // TODO: Добавить элемент в очередь.
    public static void addElementStack(Stack<String> details,String elementCar) {
        details.push(elementCar);
    }

    // TODO: Получить и удалить первый элемент из очереди.
    public static void popElementStack(Stack<String> details) {
        details.pop();
    }

    // TODO: Проверить, пуста ли очередь.
    public static boolean сheckStack(Stack<String> details) {
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
