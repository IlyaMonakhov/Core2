package task.generics;

import task.models.BigBox;
import task.models.MediumBox;
import task.models.MicroBox;
import task.models.SmallBox;

import java.util.ArrayList;
import java.util.List;

public class Generics {


    public static void main(String[] args) {
        List<BigBox> Producer = new ArrayList<>();
        Producer.add(new BigBox());
        Producer.add(new MediumBox());
        Producer.add(new MicroBox());

        List<BigBox> Consumer = new ArrayList<>();
        Consumer.add(new SmallBox());
        Consumer.add(new BigBox());
        Consumer.add(new MicroBox());
        Consumer.add(new BigBox());
        System.out.println("Метод для проверки наличия коробки в списке");
        SmallBox box = new SmallBox();
        System.out.println(checkBoxList(Producer,box));
        System.out.println("Метод для добавления коробок в список (Consumer)");
        System.out.println(Consumer);
        addBoxList(Consumer,box);
        System.out.println(Consumer);
        System.out.println(" Метод для печати списка коробок (Producer)");
        printListBox(Producer,box);
        System.out.println("Метод для копирования коробок из одного списка в другой (Producer и Consumer)");
        copyingBox(Producer,Consumer);
        System.out.println(Producer);
        System.out.println(Consumer);


    }


    //TODO: реализуйте Метод для проверки наличия коробки в списке (Producer)
    private static <T extends BigBox> boolean checkBoxList(List<T> Producer, T box) {
        return Producer.contains(box);
    }
    //TODO: реализуйте Метод для добавления коробок в список (Consumer)
    private static <T extends BigBox> void addBoxList(List<T> Consumer, T box) {
        Consumer.add(box);
    }
    //TODO: реализуйте Метод для печати списка коробок (Producer)
    private static <T extends BigBox> void  printListBox(List<T> Producer, T box){
        System.out.println(Producer);
    }

    //TODO: реализуйте Метод для копирования коробок из одного списка в другой (Producer и Consumer)
    private static <T extends BigBox> void copyingBox(List<T> Producer,List<T> Consumer){
        Producer.addAll(Consumer);
    }

    private static BigBox generateBigBox() {
        BigBox bigBox = new BigBox();
        bigBox.setMediumBox(generateMediumBox());
        bigBox.setHeight(20);
        bigBox.setLength(20);
        bigBox.setSize("big");
        bigBox.setWidth(20);
        return bigBox;
    }

    private static MediumBox generateMediumBox() {
        MediumBox mediumBox = new MediumBox();
        mediumBox.setSmallBox(generatSmallBox());
        mediumBox.setHeight(15);
        mediumBox.setLength(15);
        mediumBox.setSize("medium");
        mediumBox.setWidth(15);
        return mediumBox;
    }

    private static SmallBox generatSmallBox() {
        SmallBox smallBox = new SmallBox();
        smallBox.setMicroBox(generatMicroBox());
        smallBox.setHeight(10);
        smallBox.setLength(10);
        smallBox.setSize("small");
        smallBox.setWidth(10);
        return smallBox;
    }

    private static MicroBox generatMicroBox() {
        MicroBox microBox = new MicroBox();
        microBox.setHeight(5);
        microBox.setLength(5);
        microBox.setSize("small");
        microBox.setWidth(5);
        return microBox;
    }


}
