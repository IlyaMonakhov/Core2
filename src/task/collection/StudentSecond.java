package task.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentSecond {
    // TODO: Учет посещаемости:
    //  Создайте класс Student с полями name и attendance.
    //  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
    //  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
    private String name;
    private int attendance;

    public StudentSecond(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }


    public static void minAttendance(List<StudentSecond> studentSecondList) {
        for (StudentSecond studentSecond : studentSecondList) {
            if (studentSecond.attendance < 55) {
                System.out.println(studentSecond.name + " " + studentSecond.attendance);
            }
        }
    }


    public static int averageAttendance(List<StudentSecond> studentSecondList) {
        int average = 0;

        for (StudentSecond studentSecond : studentSecondList) {
            average += studentSecond.attendance;
        }
        return average / studentSecondList.size();
    }
}
