package Lesson4;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class Task4 {
    public static void main(String [] args){
        for (int a : linearize(new int[][]{{1,2,6,3},{1,2,3,8}})) {
            System.out.print(a);
            System.out.print(" ");
        }
        printArr();
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
