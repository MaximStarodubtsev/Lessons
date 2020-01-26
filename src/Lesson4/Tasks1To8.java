package Lesson4;

import java.util.Random;

public class Tasks1To8 {
    public static void main ( String [] args){
       // System.out.println(equals(new int[][]{{1,2},{1,2}},new int[][]{{1,3},{1,2}},1,2));
        shuffleAndPrintDeck(randomCard());
    }
    public static void printArray(int [] arr){
        System.out.println("Print array: ");
        for ( int a: arr){
            System.out.println(a);
        }
        for ( int i = arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void print100Numbers(){
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i<100; i ++){
            if (num1 < num2){
                num1 += 13;
                System.out.println(num1);
            }
            else if (num1 > num2){
                num2 +=17;
                System.out.println(num2);
            }
            else {
                num1+= 13;
                System.out.println(num1);
            }
        }
    }
    public static void printSumOfElements(int[] arr){
        int indexMin = 0;
        int indexMax = 0;
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            if (min > arr[i]) {indexMin = i; min = arr[i];}
            if (max < arr[i]) {indexMax = i; max = arr[i];}
        }
        if (indexMax< indexMin){
            while (indexMax <= indexMin)
            {sum += arr[indexMax];
            indexMax++;}
        } else if (indexMin< indexMax)
            while (indexMin <= indexMax)
            {sum += arr[indexMin];
                indexMin++;}
        else sum =arr[indexMax];
        System.out.println ("Min element: " + min + "\n" + "Max element: "+ max + "\n" + "Sum of elements: " + sum);
    }
    public static void printRandomArray(){
        int a = 10;
        int b = 99;
        double [] c = new double[4];
        double f = 0;
        int i = 0;
        while (i != 4) {
            f = Math.random()*99;
            if (f>10) {
                c[i]=f;
                System.out.println(f + "\n");
                i++;
            }
        }
        if (isArraySequential(c)) System.out.println("Array is sequential");
        else System.out.println("Array is not sequential");
    }
    public static boolean isArraySequential(double arr[]){
        int i=0;
        while (i!=3){
            if (arr[i]>arr[i+1])
                return false;
            i++;
        }
        return true;
    }
    public static boolean equals(int [][]arr1, int [][]arr2, int string, int column){
        if (arr1[string-1][column-1]==arr2[string-1][column-1])
            return true;
        else return false;
    }
    public static String[] randomCard()
    {
        String[] suits = new String[] {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] ranks = new String[] {"2", "3", "4", "5", "6", "7", "8 ", "9","10", "Jacket", "Queen","King", "Ace"};
        int randomSuit = (new Random()).nextInt(3) ;
        int randomRank = (new Random().nextInt(12));
        System.out.println(ranks[randomRank]+ " of "+ suits[randomSuit]);
        String [] deck = new String[ranks.length*suits.length];
        int l = 0;
        for(String a: suits){
            for (String b: ranks){
                deck[l] = b + " of "+ a;
                l++;
            }
        }

        return deck;
    }
    public static void shuffleAndPrintDeck(String[] deck){
        for (String a: deck){
            System.out.println(a);
        }
        int i = 0;
        int randNum1 = 1;
        int randNum2 = 1;
        String buffer = "";
        while (i<1000) {
            randNum1 = (new Random()).nextInt(51);
            randNum2 = (new Random()).nextInt(51);
            buffer = deck[randNum1];
            deck[randNum1] = deck[randNum2];
            deck[randNum2 ] =buffer;
            i++;
        }

        for (String a: deck){
            System.out.println(a);
        }

    }
}
