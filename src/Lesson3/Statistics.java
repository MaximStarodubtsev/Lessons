package Lesson3;

import java.util.LinkedList;
import java.util.Scanner;

public class Statistics {
    public static void main (String[] args )
    {
        printStatistic();
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
