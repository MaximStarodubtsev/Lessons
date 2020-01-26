package Lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Task1 {
    public static void main(String[] args) {

        String str = " hi, you hi hi you world";
        String str2 = str.replaceAll("[,:.;()]"," ");
        System.out.println(str2);
        String [] str1 = str2.split("\\s+");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String s :str1 ){
            if(s.length() != 0) {
                int i = 0;
                for (String k : str1) {
                    if (k .equals(s))
                        i++;
                }
                hashMap.put(s, i);
            }
        }
        Object[] map = hashMap.keySet().toArray();
        for (Object m : map)
        {

            System.out.println(m.toString() +" "+ hashMap.get(m.toString()));
        }

    }
}

