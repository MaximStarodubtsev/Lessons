package Lesson3;

public class Task3 {
    public static void main(String [] args){
        if (isSimpleNum(72))
            System.out.println("Число простое");
        else System.out.println("Число не простое");
    }
    public static boolean isSimpleNum(int num){

        for(int i=2; i<num; i++){
            if (num%i ==0) return false;
            char d = 'c';
        }
        return true;
    }
}
