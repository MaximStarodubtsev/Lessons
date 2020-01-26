package Lesson10;

import java.util.*;


public class Task2 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("age");
        list.add("asfef");
        list.add("elfjkg");
        list.add(1, "inserted el");

        Garage garage = new Garage();
        garage.parkingAuto(new BMW("X5", "5000", 1985));
        garage.parkingAuto(new BMW("X5", "5000", 1985));
        garage.parkingAuto(new BMW("B3", "5000", 1985));
        garage.parkingAuto(new Maybach("B5", "5000", 1985));
        garage.parkingAuto(new Maybach("B5", "5000", 1985));
        garage.parkingAuto(new BMW("X5", "5000", 1985));

        System.out.println(garage.toString());
        System.out.println();
        System.out.println(garage.toString());
        System.out.println();
        garage.getCountOfAuto("BMW");
        System.out.println();
        garage.getCountOfAuto("Folkswagen");
        System.out.println();
        garage.getCountOfAuto("Maybach");

    }
}
class Garage{
    private HashMap<Car, Integer> hashMap;
    public Garage(){
        hashMap = new HashMap<>();
    }
    public void parkingAuto (Car car){
        if(hashMap.containsKey(car)){
            int i = hashMap.get(car);
            i++;
            hashMap.put(car, i);
        }
        else hashMap.put(car, 1);
    }
    public void getOutAuto(Car car){
        if(hashMap.containsKey(car)){
            int i = hashMap.get(car);
            i--;
            hashMap.put(car, i);
        }
    }

    @Override
    public String toString() {
        return "Garage{"+ hashMap +
                '}';
    }

    public void getCountOfAuto(String mark){
        int i = 0;
        for(Car car: hashMap.keySet()){
            if(car.getMark() == mark)
                i+=hashMap.get(car);
        }
        System.out.println("Count of " + mark+" : "+ i);
    }
}
class Car{

    public Car(){}
    public String getMark() {
        return mark;
    }

    public Car(String mark, String model, int age, String series) {
        this.mark = mark;
        this.model = model;
        this.age = age;
        this.series = series;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    private String mark;
    private String model;
    private int age;
    private String series;

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                ", series='" + series + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Car car = (Car) o;
        return getAge() == car.getAge() &&
                getMark().equals(car.getMark()) &&
                getModel().equals(car.getModel()) &&
                getSeries().equals(car.getSeries());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMark(), getModel(), getAge(), getSeries());
    }
}

class BMW extends Car{
    public BMW(String model, String series, int age){
        super("BMW", model, age, series);
    }
}
class Folkswagen extends Car{
    public Folkswagen(String model, String series, int age){
        super("Folkswagen", model, age, series);
    }
}
class Mersedes extends Car{
    public Mersedes(String model, String series, int age){
        super("Mersedes", model, age, series);
    }
}
class Maybach extends Car{
    public Maybach(String model, String series, int age){
        super("Maybach", model, age, series);
    }
}
