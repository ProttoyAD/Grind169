package Grind75.ValidParenthesis;

import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        String ok="()[]{}";
        String[] my=ok.split("");
        Arrays.stream(my).forEach(System.out::println);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMappings = new HashMap<>();
        bracketMappings.put(')', '(');
        bracketMappings.put('}', '{');
        bracketMappings.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketMappings.containsValue(c)) {
                stack.push(c);
            } else if (bracketMappings.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != bracketMappings.get(c)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();

    }
}
