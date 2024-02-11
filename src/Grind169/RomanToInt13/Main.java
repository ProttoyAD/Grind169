package Grind169.RomanToInt13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));

    }


    public static int romanToInt(String s) {
        int result=0;
        int previous = 0;
        HashMap<Character,Integer> values=new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        if (values.size()>1){
            result=values.get(s.charAt(s.length()-1));
            previous=result;
        }
        for (int i=s.length()-2; i>=0;i--){
                if (values.get(s.charAt(i))<previous){
                    previous=values.get(s.charAt(i));
                    result-=values.get(s.charAt(i));
                }
                else {
                    result+=values.get(s.charAt(i));
                    previous=values.get(s.charAt(i));
                }
            }


        return result;
    }
}
