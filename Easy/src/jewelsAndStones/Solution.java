package jewelsAndStones;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int numJewelsInStones(String J, String S) {
		int JewelsNum = 0;
		Set<Character> JewelTypes = new HashSet<Character>();
		for (char i : J.toCharArray()) {
			JewelTypes.add(i);
		}
		for (char i : S.toCharArray()) {
			if (JewelTypes.contains(i)) {
				JewelsNum++;
			}
		}
		return JewelsNum;
	}
}