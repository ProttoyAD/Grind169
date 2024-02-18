package Grind169.PalindromeNumber9;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        boolean result=false;
        String value=String.valueOf(x);
        int start=0, end=value.length()-1;
        for (int i=0;i<value.length();i++){
            if (start==end || end<start){
               result= true;
            }
            else {
                if (value.charAt(start)!=value.charAt(end)){
                    return false;
                }
            }
            start++;
            end--;
        }
        return result;
    }

}
