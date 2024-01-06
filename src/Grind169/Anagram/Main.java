package Grind169.Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagramYt("car", "rac"));
//        String s="car";
//        char[] my=new char[10];
//        my[0]='0';
//        my[0]++;
//        my[0]++;
//        my[1]++;
//        System.out.println(isAnagramYt());



    }
    public static boolean isAnagram(String s, String t) {
        ArrayList<String> string=new ArrayList<>(Arrays.asList(s.split("")));
        ArrayList<String> matcher=new ArrayList<>(Arrays.asList(t.split("")));
        if (string.size()==matcher.size()){
            matcher.forEach(s1 -> {
                if (string.contains(s1)){
                    string.remove(s1);
                }

            });
            return string.isEmpty();
        }
        else {
            return false;
        }
    }


    public static boolean isAnagramYt(String s, String t) {
        int[] count=new int[26];
        //26 size cause 26 letters
        if (s.length()==t.length()) {
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }
            for (int c:count) {
                if (c!=0){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

}
