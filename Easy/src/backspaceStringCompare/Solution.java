package backspaceStringCompare;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<Character>();
        Stack<Character> t = new Stack<Character>();
        for (char c : S.toCharArray()){
            if (c != '#'){
                s.push(c);
            }else if (c == '#' && !s.isEmpty()){
                s.pop();
            }
        }
        for(char c : T.toCharArray()){
            if (c != '#'){
                t.push(c);
            }else if (c == '#' && !t.isEmpty()){
                t.pop();
            }
        }
        return s.equals(t);
    }
}