package valid_parentheses;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));

	}

	public static boolean isValid(String s) {
		Stack<Character> stck = new Stack<Character>();
		for (Character c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stck.push(c);
			} else if (!stck.isEmpty() && c == ')' && stck.peek() == '(') {
				stck.pop();
			} else if (!stck.isEmpty() && c == '}' && stck.peek() == '{') {
				stck.pop();
			} else if (!stck.isEmpty() && c == ']' && stck.peek() == '[') {
				stck.pop();
			} else {
				return false;
			}
		}
		return stck.isEmpty();
	}
}
