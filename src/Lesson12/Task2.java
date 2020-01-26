package Lesson12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("D:\\RandomNumbersFile.txt");
        try{
            file.createNewFile();
            FileInputStream fileInputStream = new FileInputStream(file);
            FileWriter fw = new FileWriter(file);
            fw.flush();

            Random rand = new Random();
            for(int i =0 ; i<10; i++){
                fw.write(((Integer)rand.nextInt(100)).toString() + " ");
            }

            fw.close();
            FileReader fr = new FileReader("D:\\RandomNumbersFile.txt");

            StringBuilder str = new StringBuilder();
            int ch = 0;
            while( (ch = fr.read())!= -1){
                str.append((char) ch );
            }
            String str1 = str.toString();

            String[] numbs = str1.split(" ");
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < numbs.length; i++) {
                list.add(Integer.parseInt(numbs[i]));
            }

            FileWriter fw1 = new FileWriter(file);

            Collections.sort(list);
            quickSort(new int[]{1,2,3,4,9,5,8,6,7},0, 8);
            for(int a: list){
                fw1.write(a+" ");
            }
            fw1.close();
            System.out.println(numbs);

        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    // Зависает на проверке, не знаю почему
    public static void quickSort(int []numbs, int low, int high ) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        int i = low;
        int j = high;
        while (i <= j) {
            while (numbs[i] < numbs[mid]) {
                i++;
            }
            while (numbs[j] > numbs[mid]) ;// Здесь зависает 
            {
                j--;
            }
            if (i <= j) {
                int buff = numbs[i];
                numbs[i] = numbs[j];
                numbs[j] = buff;
                i++;
                j--;
                System.out.println(Arrays.toString(numbs));
            }
        }
        if (low < j) {
            quickSort(numbs, low, j);
        }
        if (high > i) {
            quickSort(numbs, i, high);
        }
    }
}
