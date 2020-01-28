package Lesson3;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Collections;
import java.util.LinkedList;

public class Fibonacci {
    public static void main (String[] args )
    {
        printFibonacci(12);
        System.out.println();
        printRecursiveFibonacci(12);
    }

    //FibonacciFunction - cycle realisation
    public static void printFibonacci(int num){
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list,0, 1, 1);
        int fib1 = 1;
        int fib2 = 1;
        int sum = 0;
        for(int i = 0; i<num-3; i++ ){
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            list.add(sum);
            if(sum> Integer.MAX_VALUE/2) break;
        }
        for (int a: list){
            System.out.print(a);
            System.out.print(" ");
        }
    }

    //FibonacciFunction - recursive realisation
    private static int recursiveFibonacci (int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return recursiveFibonacci(index - 1) +  recursiveFibonacci(index - 2);
        }
    }

    public static void printRecursiveFibonacci (int n) {
        for (int i = 0; i< n; i++) {
            System.out.print( recursiveFibonacci(i));
            System.out.print(" ");
        }
    }
}
