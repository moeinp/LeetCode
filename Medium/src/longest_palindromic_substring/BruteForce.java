package longest_palindromic_substring;

public class BruteForce {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}

	public static String longestPalindrome(String s) {
		String longestPal = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (isPalindrome(s.substring(i, j)) && (s.substring(i, j).length() > longestPal.length())) {
					longestPal = s.substring(i, j);
				}

			}
		}
		return longestPal;
	}

	public static boolean isPalindrome(String s) {
		int front = 0;
		int back = s.length() - 1;
		while (front < back) {
			if (s.charAt(front) != s.charAt(back)) {
				return false;
			}
			front++;
			back--;
		}
		return true;
	}
}
