package Fouth_Package;

import java.util.ArrayList;
import java.util.Scanner;

public class Fouth_Class {
    public static void main(String [] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите одну сторону первого дома:");
//        int a = scan.nextInt();
//        System.out.println("Введите другую сторону первого дома:");
//        int b = scan.nextInt();
//        System.out.println("Введите одну сторону второго дома:");
//        int c = scan.nextInt();
//        System.out.println("Введите другую сторону второго дома:");
//        int d = scan.nextInt();
//        System.out.println("Введите одну сторону площади размещения:");
//        int f = scan.nextInt();
//        System.out.println("Введите другую сторону площади размещения:");
//        int e = scan.nextInt();
//        if (checkSizes(a,b,c,d,e,f)){
//            System.out.println("Дома вмещаются");
//        } else System.out.println("Дома не вмещаются");

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(5);
        b.add(3);


        for(Integer buf: b) {
            int size1 = a.size();
            for (int i = 0; i < size1; i++) {
                if (buf.intValue() < (int) a.toArray()[i]) {
                    a.add(i, buf);
                    break;
                } else if (i == (size1 - 1 )) {
                    a.add(size1, buf);

                    /*int buffer;
                    buffer = (int) a.toArray()[i];
                    a.toArray()[i] = a.toArray()[i - 1];
                    a.toArray()[i - 1] = buffer;*/
                    break;
                }
            }
        }
        System.out.println(a.toString());
    }
    public static boolean checkSizes(int a, int b, int c, int d, int e, int f){
        return ((a+c <=e&&b+d <=f)||(a+d<=e&&b+c<=f)||(a+c<=f&&b+d<=e)||(a+d<=f&&b+c<=e));
    }

    //задание номер 9
public static void printOffset(){
    System.out.println("Введите букву:");
    Scanner scan = new Scanner(System.in);
    char chr = scan.nextLine().charAt(0);
    System.out.println("Введите смещение:");
    int offset = scan.nextInt();
    char chrOffset = (char)(offset + (int)chr);
    System.out.println("Буква с учётом смещения: " + chrOffset);
}
    //Задание номер 8
    public static void printResult(){
        System.out.println("Введите целое число:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num%10 == 3) System.out.println("Число оканчивается на 3");
        else System.out.println("Число не окачивается на 3");

    }
    public static int printSquareOfNum(int a){
        return a*a;
    }

    public static int printTheGreatestNum(int a, int b){
        if (a>b) return a;
        else if (a!=b) return b;
        return b;
    }

    public static void print ()
    {
        System.out.println("Введите ваш год:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if ((num % 100) == 0 && (num % 400)!=0)
            System.out.println("Год не високосный");
        else if ((num % 100) == 0 && (num% 400)==0)
            System.out.println("Год високосный");
        else if (num% 4 == 0)
            System.out.println("Год високосный");
    }

    public static void printTwoWords(){
        System.out.println("Введите два одинаковых слова:");
        Scanner scan = new Scanner(System.in);
        String strFirst = scan.nextLine();
        String strSecond = scan.nextLine();
        if(strFirst.equals(strSecond)) System.out.println("Слова одинаковы");
        else if (strFirst.equalsIgnoreCase(strSecond)) System.out.println("Хорошо. Почти одинаковы");
        else if (strFirst.length() == strSecond.length()) System.out.println("Ну хотя бы одной длины");

    }

    public static void printDate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сегодняшнее число:");
        int num = scan.nextInt();
        System.out.println("Введите месяц:");
        int month = scan.nextInt();
        System.out.println("Введите год:");
        int year = scan.nextInt();

        num++;
        switch (month) {
            case (1):
                if(num > 31){
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Февраль", year));
                }else
                    System.out.println(returnDate(num,"Январь", year));
                break;
            case (2):
              if (num ==28 && (year%4==0))                 {
                num++;
                  System.out.println(returnDate(num,"Февраль", year));}
                else if (num==29) {
                  num = 1;
                  month++;
                  System.out.println(returnDate(num,"Март", year));
              }else
                  System.out.println(returnDate(num,"Февраль", year));
                    break;
            case (3):
                if(num > 31)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Апрель", year));
                }
                else System.out.println(returnDate(num,"Март", year));
                break;
            case (4):
                if(num > 30)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Май", year));
                }
                else System.out.println(returnDate(num,"Апрель", year));
                break;
            case (5):
                if(num > 31)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Июль", year));
                }
                else System.out.println(returnDate(num,"Май", year));
                break;
            case (6):
                if(num > 30)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Июнь", year));
                }
                else System.out.println(returnDate(num,"Июль", year));
                break;
            case (7):
                if(num > 31)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Август", year));
                }
                else System.out.println(returnDate(num,"Июль", year));
                break;
            case (8):
                if(num > 31)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Сентябрь", year));
                }
                else System.out.println(returnDate(num,"Август", year));
                break;
            case (9):
                if(num > 30)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Октябрь", year));
                }
                else System.out.println(returnDate(num,"Сентябрь", year));
                break;
            case (10):
                if(num > 31)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Ноябрь", year));
                }
                else System.out.println(returnDate(num,"Октябрь", year));
                break;
            case (11):
                if(num > 30)
                {
                    num = 1;
                    month++;
                    System.out.println(returnDate(num,"Декабрь", year));
                }
                else System.out.println(returnDate(num,"Ноябрь", year));
                break;
            case (12):
                if(num > 31)
                {
                    num = 1;
                    month = 1;
                    year++;
                    System.out.println(returnDate(num,"Январь", year));
                }
                else System.out.println(returnDate(num,"Декабрь", year));
                break;
        }

    }
    public static String returnDate (int num, String month, int year){
        return "Завтрашнее число: " + num + "." + month + "." + year;
    }
}
