package validParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stck.push(c);
            }
            else if (!stck.isEmpty() && stck.peek() == '(' && c == ')' ){
                stck.pop();
            }
            else if (!stck.isEmpty() && stck.peek() == '{' && c == '}' ){
                stck.pop();
            }
            else if (!stck.isEmpty() && stck.peek() == '[' && c == ']' ){
                stck.pop();
            }else{
                return false;
            }
        }
        return stck.isEmpty();
    }
}