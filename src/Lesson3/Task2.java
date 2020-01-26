package Lesson3;

public class Task2 {
    public static void main(String [] args){
        System.out.println(cycleFactorial(6) + " and " + recursiveFactorial(6));

    }
    public static double cycleFactorial(double x){
        double sum = 1;
        while (x!=0){
            sum*=x;
            x--;
        }
        return sum;
    }
    public static double recursiveFactorial(double x){
        if (x == 0){
            return 1;
        }
        return x*recursiveFactorial(x-1);
    }

}
