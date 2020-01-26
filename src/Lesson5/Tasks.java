package Lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {
        //double startTime = System.currentTimeMillis();
        //concatWithString();
        //double endTime = System.currentTimeMillis() - startTime;
        //System.out.println("Time execution of concatWithString : " + endTime);

        /*startTime = System.currentTimeMillis();
        concatWithStringBuilder();
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Time execution of concatWithStringBuilder : " + endTime);*/
        //System.out.println(startEndWithWord("Motion of Heart, Heart Motion", "Motion"));
        reverseWord("You're my heart, you're  my soul!...");

    }
    public static void reverseWord(String str){
        String str2 = "";
        StringBuilder str1 = new StringBuilder(str);
        str2 = str1.reverse().toString();
        System.out.println(str2);
    }
    public static void replaceRepeatedSymbols(String str){
        String strRes = new String();
        for(int i = 0; i<str.length()-2; i++){
            strRes = strRes + String.valueOf(str.charAt(i));
            if(str.charAt(i)==str.charAt(i+1)) {
                while(str.charAt(i)==str.charAt(i+1)){
                    i++;
                    if (i>str.length()-2) break;
                }
            }

        }
        System.out.println(strRes);
    }

    public static int countWords(String str) {
        String [] strs = str.split("[\\s]+");
        return strs.length;
    }
    public static void printSplitedString(String str, int n) {
        int num = str.length() / n;
        String[] results = new String[n];
        StringBuilder str1 = new StringBuilder(str);
        int i = 0;
        int j = 0;
        while (i < str.length()) {
            if (i + num < str.length())
                results[j] = str.substring(i, i + num);
            else results[j] = str.substring(i, i + str.length() % n);
            i+=num;
            j++;
        }
        for (String a : results) {
            System.out.print(a+' ');
        }
    }
    public static void countDotsCommasAndExclamationMark(String str ) {
        int count = 0;
        for(int i =0; i < str.toCharArray().length; i++){
            if (str.toCharArray()[i]=='.')count ++;}
        System.out.println("Count of dots: " + count);
        count = 0;
        for(int i =0; i < str.toCharArray().length; i++){
            if (str.toCharArray()[i]==',')count ++;}
        System.out.println("Count of commas: " + count);
        count = 0;
        for(int i =0; i < str.toCharArray().length; i++){
            if (str.toCharArray()[i]=='!')count ++;}
        System.out.println("Count of exclamation marks: " + count);

    }
    public static boolean equalsArrays(String[] arr1, String[] arr2){
        for (int i = 0;i < arr1.length; i++){
            for (int j =0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]) break;
                if ( j == arr2.length-1) return false;
            }
        }
        return true;
    }
    public static void printInitials(String surname, String name, String patronymic){
        System.out.println(surname.toUpperCase().charAt(0) + "." + name.toUpperCase().charAt(0) + "." + patronymic.toUpperCase().charAt(0) + ".");
    }
    public static boolean startEndWithWord(String str, String word){
        if(str.startsWith(word)&&str.endsWith(word))
            return true;
        else return false;
    }
    public static void replaceSmiles(){
        String str = "cat:( cat:(";
        String regex = "cat";
        str = str.replaceAll(":\\(",":)");
       /* Pattern r = Pattern.compile(":\\(");
        Matcher matcher = r.matcher(str);
        str = matcher.replaceAll(":)");*/

        System.out.println(str);
    }

    public static void concatWithString(){
        String a =" ";
        for (int i = 0; i < 100000; i++)
            a.concat(a);
    }
    public static void concatWithStringBuilder(){
        StringBuilder str = new StringBuilder("a");
        for (int i = 0; i < 100000; i++)
            str.append("a");
    }
}
