package Fouth_Package;

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

        if (discriminant(a,b,c)<0) System.out.println("Корней не существует");
            else if (discriminant(a,b,c)==0) System.out.println("Корень один: " + (-b/2*a));
            else System.out.println("Корней два: " + (-b+Math.pow(discriminant(a,b,c),1/2)/2*a) + " и " + (-b-Math.pow(discriminant(a,b,c),1/2)/2*a));
    }

    public static double discriminant(double a, double b, double c){
        return Math.pow(b,2) - 4*a*c;
    }
}
