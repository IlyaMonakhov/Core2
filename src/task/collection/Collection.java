package task.collection;

import java.util.*;
import java.util.Map;


public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> ListNumber = new ArrayList<>();
        ListNumber.add(12);
        ListNumber.add(55);
        ListNumber.add(33);
        ListNumber.add(33);
        ListNumber.add(22);
        ListNumber.add(46);
        System.out.println(maxNumbers(ListNumber));
        removeDuplicates(ListNumber);
        System.out.println(ListNumber);
        sortDescendingOrder(ListNumber);
        System.out.println(ListNumber);
        Set<String> SetNamesFirst = new HashSet<>();
        SetNamesFirst.add("Zaur");
        SetNamesFirst.add("Marina");
        SetNamesFirst.add("Igor");
        SetNamesFirst.add("Misha");
        contentElement(SetNamesFirst);
        System.out.println(SetNamesFirst.contains("Zaur"));
        Set<String> SetNamesSecond = new HashSet<>();
        SetNamesSecond.add("Ilya");
        SetNamesSecond.add("Egor");
        SetNamesSecond.add("Denis");
        System.out.println(intersection(SetNamesFirst, SetNamesSecond));

        Map<Integer, String> PassportСontrol = new HashMap<>();
        PassportСontrol.put(125, "Ivan");
        PassportСontrol.put(458, "Ilya");
        PassportСontrol.put(555, "Igor");
        PassportСontrol.put(666, "Egor");
        PassportСontrol.put(777, "Masha");
        System.out.println(PassportСontrol.containsKey(666));
        int key = 555;
        getPassportСontrol(PassportСontrol,key);
        System.out.println(PassportСontrol.get(666));
        removePassportСontrol(PassportСontrol);
        System.out.println(PassportСontrol);
        Stack<String> Details = new Stack<>();
        Details.push("engine");
        Details.push("wheel");
        Details.push("mirror");
        Details.push("pin");
        System.out.println(Details);
        addStack(Details);
        System.out.println(Details);
        popStack(Details);
        System.out.println(Details);
        isEmptyStack(Details);
        System.out.println(Details.isEmpty());


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
    public static void removeDuplicates(ArrayList<Integer> ListNumber) {
        ListNumber.remove(3);
    }

    // TODO: Отсортировать список в порядке убывания.
    public static ArrayList<Integer> sortDescendingOrder(ArrayList<Integer> ListNumber) {
        Collections.sort(ListNumber, Collections.reverseOrder());
        return ListNumber;
    }

    // TODO: Проверить, содержит ли множество определенный элемент.
    public static boolean contentElement(Set<String> SetNamesFirst) {
        return SetNamesFirst.contains("Zaur");
    }

    // TODO: Найти пересечение двух множеств.
    public static boolean intersection(Set SetNamesFirst, Set SetNamesSecond) {
        return SetNamesSecond.retainAll(SetNamesFirst);
    }

    // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
    public static void recurringRemoval(Set SetNamesFirst, Set SetNamesSecond) {
        SetNamesFirst.removeAll(SetNamesSecond);
    }

    // TODO: Проверить, содержит ли карта определенный ключ.
    public static boolean сheckingKey(Map<Integer, String> PassportСontrol) {
        return PassportСontrol.containsKey(666);
    }

    // TODO: Получить все значения, связанные с определенным ключом.
    public static void getPassportСontrol(Map<Integer, String> PassportСontrol, int key) {
        List<String> values = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : PassportСontrol.entrySet()) {
            if (entry.getKey().equals(key)) {
                values.add(entry.getValue());
            }
        }
        if (PassportСontrol.containsKey(key)) {
            System.out.println("Значения ключа " + key + values);
        } else {
            System.out.println("Такого ключа нет!");
        }
    }

    // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
    public static void removePassportСontrol(Map<Integer, String> PassportСontrol) {
        PassportСontrol.remove(777);
    }

    // TODO: Добавить элемент в очередь.
    public static void addStack(Stack<String> Details) {
        Details.push("brakes");
    }

    // TODO: Получить и удалить первый элемент из очереди.
    public static void popStack(Stack<String> Details) {
        Details.pop();
    }

    // TODO: Проверить, пуста ли очередь.
    public static boolean isEmptyStack(Stack<String> Details) {
        return Details.isEmpty();
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
