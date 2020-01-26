package com.company.inner;

import java.util.Scanner;

class Outer_Demo {
    int num;
    private class Inner_Demo{
        public void print() {
            System.out.println("Это внутренний класс");
        }
    }

    public void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class Main {

    public static void main(String[] args) {

        long y = 25L;
        Outer_Demo outer = new Outer_Demo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        outer.display_Inner();
        System.out.println(y);
    }
}
