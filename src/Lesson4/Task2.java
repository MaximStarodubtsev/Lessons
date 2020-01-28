package Lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {5,6, 7,8, 4, 5, 8};
        printClearedArray(array);
    }

    public static void printClearedArray(int arr[]){
        int length = 0;
        int k = 0;
        int i = 0;
        int[] arr1 = new int[arr.length];
        for( int l =0; l < arr.length; l++){
            arr1[l] = arr[l];
        }
        while (i<arr.length-1)
        {
            k = 0;
            for (int j = 0; j<=arr.length-1; j++){
                if ( j!=i)
                    if (arr[i] == arr[j]){
                        arr1[length] = arr[i];
                        length++;
                        break;
                    }
            }
            i++;
        }
        for (int l = 0; l<arr.length; l++){
            if(!isElementInArray(arr1,arr[l],length)){
                System.out.print(arr[l]);
                System.out.print(" ");
            }

        }
    }

    public static boolean isElementInArray(int[] arr1, int element, int length){
        for (int l = 0; l<length; l++){
            if(element == arr1[l]) return true;
        }
        return false;
    }
}
