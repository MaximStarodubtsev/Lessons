package Lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String [] args){
        System.out.println("Num in format : " + numInFormat(288999999));
    }
    public static void printAlphabet(char vowel){
        char vow = 'b';
        while (vow != vowel){
            System.out.println(vow);
            vow = (char) ((int) vow + 1);
        }
    }
    public static double findTheGreatest( ){
        double[] arr = new double[10];
        for (int i = 1; i<10; i++){
            arr[i] = Math.random()*100;
            System.out.println(arr[i]);
        }
        double max = 0;
        for (double a: arr){
            if (a>max ) max=a;
        }
        return max;
    }
    public static int sumOfDigits(int num){
        int sum = 0;
        int divider = 10;
        while (num!=0){
            sum = sum + num% divider;
            num = (num - (num%divider ))/divider;
            System.out.println(num);
            System.out.println(sum);
        }
        return sum;
    }
    public static String numInFormat(int num){
        String [] str = new  String[10];
        int divider = 1000;
        String numInFormat = "";
        int i = 0;
        while(num!=0) {
            str[i] = " " + (num % 1000);
            i++;
            num = (num - (num % 1000)) / divider;
        }

        while (i>0){
            i--;
            numInFormat += str[i];

        }
        return numInFormat;
    }
}
