package Lesson3;

import java.util.Scanner;

public class Task2_3 {
    public static void main (String[] args )
    {
        printStatistic();
    }
    public static void printFibonachi(int num){
        int fib1 = 1;
        int fib2 = 1;
        int sum = 0;
        do {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            if (sum>num) break;
            System.out.println(sum);
        } while (sum < num);
    }
    public static int fib(int n)
    {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void  printStatistic(){
        System.out.println("Enter number of days: ");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int numOfDays = days;
        int sumLevel = 0;
        int maximum = 0;
        while (days!=0) {
            System.out.println("Enter level of rain: ");
            int levelOfRains = scanner.nextInt();
            sumLevel += levelOfRains;
            if (maximum < levelOfRains)
                maximum = levelOfRains;
            days--;
        }
        System.out.println("Num of days: " + numOfDays);
        System.out.println("Sum level of rains : " + sumLevel);
        System.out.println("Average level of rains : " + sumLevel/numOfDays);
        System.out.println("Maximum level of rains: " + maximum);
    }
}
