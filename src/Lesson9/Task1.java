package Lesson9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Seco");
        list.add("Thir");
        list.add("Fourth");
        for(String a: list){
            System.out.println(a);
        }

        insert(list);
        System.out.println();
        for(String a: list){
            System.out.println(a);
        }
    }

    public static void insert(ArrayList<String> list){ int i =0;
        int len = list.size();
        int k = 0;
        while (k<len){
            if(((String)list.toArray()[k]).length()==4)
            {
                list.add((String)list.toArray()[list.size()-1]);
                for (int j = list.size()-2; j > k; j--) {
                    list.set(j, list.get(j-1));
                }
                list.set(k, "****");
                k++;
            }
            k++;
        }
    }
}
