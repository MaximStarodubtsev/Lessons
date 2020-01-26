import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lesson14 {
    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<>();
//        Collections.addAll(array,7,8,9,10,11);
//        array.stream().filter((s)->(((int)s%2==0)&((int)s%5==0))).forEach((s)->System.out.println(s));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        for (Integer buf: b){
            a.add(buf);
        }
        System.out.println(a.toString());
    }
}
