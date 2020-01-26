package Lesson14;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Collections.addAll(array,7,8,9,10,11,25,35,45, 45,20);
        double average = array.stream()
                    .filter((s)->(((int)s%2!=0)&((int)s%5==0)))
                    .mapToInt((s)->Integer.valueOf(s))
                    .average()
                    .getAsDouble();
        System.out.println(average);
    }
}
