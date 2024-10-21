package hw241024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {

//     1. Составить список списков студентов, распределенных по отдельным классам List> studentGrades
//    Написать метод countTotalAmount(), который считает общее число студентов
//    Написать метод countAmountWithName(String name),
//    который считает количество студентов в школе с заданным именем name.


    public static void main(String[] args) {


        List<List<Student>> studentGrades = new ArrayList<>();


        List<Student> group1 = new ArrayList<>();
        group1.add(new Student("Tom"));
        group1.add(new Student("Nina"));
        group1.add(new Student("Victor"));


        List<Student> group2 = new ArrayList<>();
        group2.add(new Student("Alex"));
        group2.add(new Student("Tom"));
        group2.add(new Student("Max"));

        studentGrades.add(group1);
        studentGrades.add(group2);

        System.out.println(countTotalAmount(studentGrades));
        System.out.println(countAmountWithName("Tom", studentGrades));


    }

    private static int countTotalAmount(List<List<Student>> studentGrades) {
        int totalAmount = 0;
        for (List<Student> group : studentGrades) {
            totalAmount += group.size();
        }
        return totalAmount;
    }

    private static int countAmountWithName(String name, List<List<Student>> studentGrades) {
        int totalAmount = 0;
        for (List<Student> group : studentGrades) {
            for (Student student : group) {
                if (name.equalsIgnoreCase(student.getName())) {
                    totalAmount++;
                }
            }
        }
        return totalAmount;
    }





}




