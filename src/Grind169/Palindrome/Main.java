package Grind169.Palindrome;

public class Main {
    public static void main(String[] args) {
        String string= "race a car";
        System.out.println(isPalindrome(string));

    }

    public static boolean isPalindrome(String s) {
        String result=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder stringBuilder= new StringBuilder(result);
        stringBuilder.reverse();
        System.out.println(result);
        System.out.println(stringBuilder);
        if (String.valueOf(stringBuilder).equals(result)){
            return true;
        }
        else {
            return false;
        }
    }
}
