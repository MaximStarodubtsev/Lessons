package Lesson4;

public class Task3 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,6};
        int [] array2 = {1,2,3,4,5,6};
        int [] array3 = mergeTwoArrays(array1, array2);
        for(int a: array3){
            System.out.print(a);
            System.out.print(" ");
        }
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
}
