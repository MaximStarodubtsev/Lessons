package Lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        printOffsetArray(array);
    }

    public static void printOffsetArray(int arr[]){
        int lastElement = arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        for (int a: arr){
            System. out.print(a);
            System. out.print(" ");
        }
    }
}
