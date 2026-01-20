package leetcode.easy.p20_valid_parentheses;

import java.util.Stack;

public class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : s.toCharArray()) {
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c);
//            }
//
//            else {
//                if (stack.isEmpty()) return false;
//
//                char top = stack.pop();
//                if (c == ')' && top != '(') return false;
//                if (c == ']' && top != '[') return false;
//                if (c == '}' && top != '{') return false;
//            }
//        }
//
//        return stack.isEmpty();
//    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
