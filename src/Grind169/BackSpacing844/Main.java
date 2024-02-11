package Grind169.BackSpacing844;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }

    public static boolean backspaceCompare(String s, String t) {

        return stringMaker(s).equals(stringMaker(t));
    }

    public static String stringMaker(String str) {
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#' && temp.size() != 0) {
                temp.remove(temp.size() - 1);

            } else {
                temp.add(str.charAt(i));
            }

        }
        String string="";
        for (Character character: temp){
            string+=character;
        }
        return string.replace("#", "");

    }
}