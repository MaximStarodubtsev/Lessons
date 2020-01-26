package Lesson12;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\file1.txt");
        try {
            FileReader fileReader = new FileReader(file);

            String str = "";
            StringBuilder st = new StringBuilder();
            System.out.println(st.toString());
            int ch;
            while ((ch = fileReader.read())!= -1) {
                st.append((char)ch);

            }
            System.out.println(st);

            str = st.toString().replaceAll("[,.;:()]", " ");
            String[] list = str.split("\\s+");
            HashMap<String, Integer> hashMap= new HashMap<>();
            for (String s: list ){
                int i = 0;
                for (String s1: list){
                    if (s.equals(s1)) {
                        i++;
                    }
                }
                hashMap.put(s, i);
            }
            for (Map.Entry entry :hashMap.entrySet()){
                System.out.println(entry.getKey().toString()+" - " +entry.getValue().toString());
            }

        }
        catch (FileNotFoundException e){
            e.getMessage();
        }
        catch (IOException e){

        }



    }
}
