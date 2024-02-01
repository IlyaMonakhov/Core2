package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Student2 {
    // TODO: Учет посещаемости:
    //  Создайте класс Student с полями name и attendance.
    //  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
    //  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
    String name;
    int attendance;
    public  Student2 (String name, int attendance){
        this.name = name;
        this.attendance = attendance;
    }

    public static void main(String[] args) {
        List<Student2> Student2List = new ArrayList<>();
        Student2List.add(new Student2("Alina",20));
        Student2List.add(new Student2("Alibaba",78));
        Student2List.add(new Student2("Bob",50));
        Student2List.add(new Student2("Join",100));
        minAttendance(Student2List);
        averageAttendance(Student2List);
        System.out.println(averageAttendance(Student2List));



    }
    public static void minAttendance(List<Student2> Student2List){
        for (Student2 student2 : Student2List){
            if (student2.attendance < 55){
                System.out.println(student2.name + " " + student2.attendance);
            }
        }
    }
    public static int averageAttendance(List<Student2> Student2List){
        int average = 0;
        for (Student2 student2 : Student2List){
            average += student2.attendance;
        }return average / Student2List.size();
    }
}
