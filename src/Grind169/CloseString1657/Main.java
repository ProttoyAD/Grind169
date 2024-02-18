package Grind169.CloseString1657;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String a="abc";
        String b="bca";
        System.out.println(closeStrings(a,b));
    }

    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Map<Character, Integer> index1=new HashMap<>();
        Map<Character, Integer> index2=new HashMap<>();
        Map<Integer, Integer> map1=new HashMap<>();
        for(int i=0; i<word1.length(); i++) {
            if (index1.containsKey(word1.charAt(i))){
                index1.replace(word1.charAt(i), index1.get(word1.charAt(i))+1);
            }
            else index1.put(word1.charAt(i),1);

            if (index2.containsKey(word2.charAt(i))){
                index2.replace(word2.charAt(i), index2.get(word2.charAt(i))+1);
            }
            else index2.put(word2.charAt(i),1);
        }

        for (Character c : index1.keySet()) {
            if (!index2.containsKey(c)) {
                return false;
            }
            if (map1.containsKey(index1.get(c))){
                map1.replace(index1.get(c), map1.get(index1.get(c))+1);
            }
            else map1.put(index1.get(c),1);
        }

        for (Integer s : index2.values()) {
            if (map1.containsKey(s) && map1.get(s) !=0){
                map1.replace(s, map1.get(s)-1);
            }
            else return false;
        }

        return true;
    }

}
