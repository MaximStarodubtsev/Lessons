package Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Victor", 24, 9));
        students.add(new Student("Pasha", 28, 10));
        students.add(new Student("Katya", 26, 7));
        students.add(new Student("Maksim", 26, 7));

        for(Student a: students){
            System.out.println(a.toString());
        }
        Collections.sort(students,new SortedByAge());
        System.out.println();
        for(Student a: students){
            System.out.println(a.toString());
        }
        Collections.sort(students,new SortedByName());
        System.out.println();
        for(Student a: students){
            System.out.println(a.toString());
        }
        Collections.sort(students,new SortedByRating());
        System.out.println();
        for(Student a: students){
            System.out.println(a.toString());
        }
    }
}

class Student{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private String name;
    private int age;
    private double rating;

    public Student(String name, int age, double rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " " + age+ " " + rating;
    }

}

class SortedByName implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2)
    {
        String str1 = student1.getName();
        String str2 = student2.getName();

        return str1.compareTo(str2);
    }
}
class SortedByAge implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2)
    {
        int age1 = student1.getAge();
        int age2 = student2.getAge();

        if(age1 > age2) {
            return 1;
        }
        else if(age1<age2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
class SortedByRating implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2)
    {
        double rating1 = student1.getRating();
        double rating2 = student2.getRating();

        if(rating1 > rating2) {
            return 1;
        }
        else if(rating1<rating2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
