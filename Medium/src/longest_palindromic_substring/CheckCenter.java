package longest_palindromic_substring;

public class CheckCenter {

	public String longestPalindrome(String s) {
		String max = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (CenterOfOddPal(s, i).length() >= max.length()) {
				max = CenterOfOddPal(s, i);

			} else if (CenterOfEvenPal(s, i).length() < max.length()) {
				max = CenterOfEvenPal(s, i);
			}
		}
		return max;
	}

	public static String CenterOfOddPal(String s, int i) {
		int left = i;
		int right = i;
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
			}
			break;
		}
		return s.substring(left + 1, right);
	}

	public static String CenterOfEvenPal(String s, int i) {
		int left = i;
		int right = i + 1;
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
			}
			break;
		}
		return s.substring(left + 1, right);
	}
}
