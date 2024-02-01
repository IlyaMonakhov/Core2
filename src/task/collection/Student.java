package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // TODO: Создание списка студентов:
    //  Создайте класс Student с полями name и age.
    //  Создайте метод, который будет принимать список студентов и выводить их на экран.
    //  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.
    String name;
    int age;
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Student> Students = new ArrayList<>();
        Students.add(new Student("Masha", 25));
        Students.add(new Student("Egor",30));
        Students.add(new Student("Zaur",24));
        Students.add(new Student("Marina",23));
        printListStudents(Students);
        int minAge = 26;
        listMaxAgeStudent(Students,minAge);
        System.out.println("Возраст больше 26");
        List<Student> maxAgeStudents = listMaxAgeStudent(Students, minAge);
        for (Student student : maxAgeStudents) {
            System.out.println(student.name + student.age);
        }




    }
    public static void printListStudents(List<Student> Students) {
        for (Student student : Students) {
            System.out.println(student.name + student.age);
        }
    }
    public static List<Student> listMaxAgeStudent(List<Student> Students, int minAge){
        List<Student> MaxAgeStudent = new ArrayList<>();
        for (Student student : Students){
            if (student.age > minAge ){
                MaxAgeStudent.add(student);
            }
        }
        return MaxAgeStudent;
    }



    }

