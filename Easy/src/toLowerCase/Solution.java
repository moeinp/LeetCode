package toLowerCase;

class Solution {
	public String toLowerCase(String str) {
		String s = "";
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			if (c >= 65 && c <= 90) {
				c = (char) ((int) c + 32);
				s = s + c;
			} else {
				s = s + c;
			}
		}
		return s;
	}
}
