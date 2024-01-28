package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(12);
        listNumbers.add(55);
        listNumbers.add(33);
        listNumbers.add(33);
        listNumbers.add(22);
        listNumbers.add(46);
        //System.out.println(maxNumbers(listNumbers));
        //removeDuplicates(listNumbers);
        //System.out.println(listNumbers);
        //sortDescendingOrder(listNumbers);
        //System.out.println(listNumbers);
        //int element = 46;
        //contentElement(listNumbers, element);
        //System.out.println(listNumbers.contains(element));
        Set<String> setNames = new HashSet<>();
        setNames.add("Zaur");
        setNames.add("Marina");
        setNames.add("Igor");
        setNames.add("Misha");
        Set<String> setNamesTwo = new HashSet<>();
        setNamesTwo.add("Ilya");
        setNamesTwo.add("Egor");
        setNamesTwo.add("Denis");
        //System.out.println(setNames.contains("Zaur"));
        //System.out.println(intersection(setNames , setNamesTwo));



    }

    // Реализуйте функциональность согласно описанию

    // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов

    // TODO: Найти наибольший элемент в списке.

    public static int maxNumbers(ArrayList<Integer> listNumbers) {
        int max = Integer.MIN_VALUE;
        for (int number : listNumbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;

    }

    // TODO: Удалить все дубликаты из списка.
    public static void removeDuplicates(ArrayList<Integer> listNumbers) {
        listNumbers.remove(3);
        System.out.println(listNumbers);
    }

    // TODO: Отсортировать список в порядке убывания.
    public static ArrayList<Integer> sortDescendingOrder(ArrayList<Integer> listNumbers) {
        Collections.sort(listNumbers, Collections.reverseOrder());
        return listNumbers;
    }

    // TODO: Проверить, содержит ли множество определенный элемент.
    public static boolean contentElement(Set<String> names) {
        return names.contains("Zaur");
    }

    // TODO: Найти пересечение двух множеств.
    public static boolean intersection(Set setNames , Set setNamesTwo){
        return setNamesTwo.retainAll(setNames);
    }

    // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
    public static void  recurringRemoval(Set setNames , Set setNamesTwo){
       setNames.removeAll(setNamesTwo);
    }

    // TODO: Проверить, содержит ли карта определенный ключ.


    // TODO: Получить все значения, связанные с определенным ключом.

    // TODO: Удалить все записи из карты, у которых значение равно определенному значению.

    // TODO: Добавить элемент в очередь.

    // TODO: Получить и удалить первый элемент из очереди.

    // TODO: Проверить, пуста ли очередь.

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
}