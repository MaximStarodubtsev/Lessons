package Second_package;

import java.util.*;

public class second_class {

    public static void main (String[] args){
        print();
    }

    public static void print() {
        System.out.println("Enter number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num==12||num==1||num==2){
            System.out.println("Now it's winter!");
        } else if (num<=5&&num>=3){
            System.out.println("Now it's spring");
        } else if (num>=6&&num<=8) {
            System.out.println("Now it's summer");
        } else if (num>=9&&num<=11){
            System.out.println("Now it's autumn");
        } else System.out.println("There isn't exist such month");
        System.out.println("Hello!");
    }

}
