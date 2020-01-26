package Lesson3;

public class Task1 {
    public static void main (String [] args){
        printPercents(1625, 2020, 24);
    }

    public static void printPercents(int a, int b, double sum){
        while (a != b){
            a++;
            sum = sum + sum * 0.05;
        }
        System.out.println("Получившаяся сумма: " + sum);
    }
}