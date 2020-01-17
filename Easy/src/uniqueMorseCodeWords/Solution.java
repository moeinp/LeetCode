package uniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int uniqueMorseRepresentations(String[] words) {
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Set<String> unique = new HashSet<String>();
		for (String s : words) {
			String MorseWord = "";
			for (char c : s.toCharArray()) {
				MorseWord = MorseWord + morse[c - 'a'];
			}
			unique.add(MorseWord);
		}
		return unique.size();

	}
}