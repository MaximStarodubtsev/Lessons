package Fouth_Package;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareFunction {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите параметр а: ");
        double a = scan.nextInt();
        System.out.println("Введите параметр b: ");
        double b = scan.nextInt();
        System.out.println("Введите параметр c:");
        double c = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        if (discriminant(a,b,c)<0) System.out.println("Корней не существует");
            else if (discriminant(a,b,c)==0) {
            System.out.println("Корень один: ");
            System.out.println(oneRoot(a, b));
        }
            else {
            System.out.println("Корней два: ");
            for(Integer buf: twoRoots(list,a,b,c)) {
                System.out.println(buf);
            }
        }
    }

    private static double oneRoot(double a, double b) {
        return -b/2*a;
    }

    private static ArrayList<Integer> twoRoots(ArrayList<Integer> list, double a, double b, double c) {
        list.add((int)(-b + Math.pow(discriminant(a, b, c), 1 / 2) / 2 * a));
        list.add((int)(-b - Math.pow(discriminant(a, b, c), 1 / 2) / 2 * a));
        return list;
    }

    public static double discriminant(double a, double b, double c){
        return Math.pow(b,2) - 4*a*c;
    }
}
