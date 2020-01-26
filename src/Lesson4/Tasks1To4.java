package Lesson4;

import lombok.Getter;

import java.util.Arrays;


@Getter
public class Tasks1To4 {
    public static void main(String [] args){
        //for ( int a: mergeTwoArrays(new int[] {1,1}, new int[] {5,5,5}))
          // System.out.println(a);
        //for (int a : linearize(new int[][]{{1,2,6,3},{1,2,3,8}}))
           //System.out.print(a + " ");
        //printArr();

    }

    public static void printOffsetArray(int arr[]){
        int lastElement = arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        for (int a: arr){
            System. out.println(a);
        }
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
            if(!isElementInArray(arr1,arr[l],length))System.out.println(arr[l]);
        }
    }

    public static boolean isElementInArray(int[] arr1, int element, int length){

        for (int l = 0; l<length; l++){
            if(element == arr1[l]) return true;
        }
        return false;
    }

    public static int[] mergeTwoArrays(int[] firstArr, int secondArr[]){
        int[] mergeArr = new int [firstArr.length+secondArr.length];
        int l = 0;
        int k = 0;
        int j = 0;
        for (int i =0 ; i< mergeArr.length; i++) {
            if (j < firstArr.length) {
                if (i % 2 == 0) {
                    mergeArr[i] = firstArr[j];
                    j++;
                } else if (k < secondArr.length) {
                    mergeArr[i] = secondArr[k];
                    k++;}
                    else if (j < firstArr.length) {
                        mergeArr[i] = firstArr[j];
                        j++;
                    }
                }
            else if (k < secondArr.length) {
                mergeArr[i] = secondArr[k];
                k++;}
            }

        return mergeArr;
    }

    public static int[] linearize(int[][] arr){
        int a= 0;
        int b= 0;
        int c = 0;
        int[] arr1 = new int[arr.length*arr[1].length];
        while(a<arr.length){
            b=0;
            while (b<arr[a].length) {
                arr1[c] = arr[a][b];
                b++;
                c++;}
            a++;}
        return arr1;
    }

    public static void printArr() {
        int[][] nums = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}
