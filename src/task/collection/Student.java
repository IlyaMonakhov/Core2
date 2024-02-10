package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // TODO: Создание списка студентов:
    //  Создайте класс Student с полями name и age.
    //  Создайте метод, который будет принимать список студентов и выводить их на экран.
    //  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.
    private String name;
    private int age;
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
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

    }

    public static void printListStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.name + student.age);
        }
    }

    public static List<Student> listMaxAgeStudent(List<Student> students, int minAge){
        List<Student> maxAgeStudent = new ArrayList<>();
        for (Student student : students){
            if (student.age > minAge ){
                maxAgeStudent.add(student);
            }
        }
        return maxAgeStudent;
    }



    }

