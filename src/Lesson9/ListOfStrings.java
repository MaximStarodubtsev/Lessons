package Lesson9;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("String");
        list.add("born");
        list.add("index");
        list.add("array");
        Iterator<String> iterator = list.iterator();
        deleteStrings(iterator);
        Iterator<String> iterator1 = list.iterator();
        list(iterator1);

    }
    public static  void deleteStrings(Iterator<String> iterator){
         do {
            if(iterator.next().length()>4) iterator.remove();
        }while (iterator.hasNext());

    }
    public static void list(Iterator<String> iterator){
        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
