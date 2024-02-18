package Grind169.DecodeString394;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(decodeString("10[c]"));
    }

    public static String decodeString(String s) {
        Stack<String> myStack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c==']'){
                String sub="";
                while(true){
                    if(myStack.peek().equals("[")){
                        myStack.pop();
                        String str=sub;
                        String slen="";
                        while(!myStack.isEmpty()){
                            String string=myStack.peek();
                            if(Character.isDigit(string.charAt(0))){
                                slen=string.charAt(0)+slen;
                                myStack.pop();
                            }
                            else break;
                        }
                        int len=Integer.parseInt(slen);
                        for(int i=0;i<len-1;i++){
                            sub=sub+str;
                        }
                        myStack.push(sub);
                        break;
                    }
                    else sub=myStack.pop()+sub;
                }
            }
            else myStack.push(String.valueOf(c));
        }
        String result="";
        while(!myStack.isEmpty()){
            result=myStack.pop()+result;
        }
        return result;
    }
    public static String chatGptdecodeString(String s) {
        Stack<String> myStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ']') {
                // Extract the encoded string within the brackets
                StringBuilder decodedString = new StringBuilder();
                while (!myStack.peek().equals("[")) {
                    decodedString.insert(0, myStack.pop());
                }
                myStack.pop(); // remove '['

                // Find the number to repeat the string
                StringBuilder repeatCountStr = new StringBuilder();
                while (!myStack.isEmpty() && Character.isDigit(myStack.peek().charAt(0))) {
                    repeatCountStr.insert(0, myStack.pop());
                }

                int repeatCount = Integer.parseInt(repeatCountStr.toString());
                String repeatedString = decodedString.toString().repeat(repeatCount);

                // Push the repeated string back to the stack
                myStack.push(repeatedString);

            } else {
                myStack.push(String.valueOf(c));
            }
        }

        // Build the final result string from the stack
        StringBuilder result = new StringBuilder();
        while (!myStack.isEmpty()) {
            result.insert(0, myStack.pop());
        }

        return result.toString();
    }


}
