package robotReturnToOrigin;

class Solution {
	public boolean judgeCircle(String moves) {
		int lAndR = 0;
		int dAndU = 0;
		for (char c : moves.toCharArray()) {
			if (c == 'U') {
				dAndU++;
			} else if (c == 'D') {
				dAndU--;
			} else if (c == 'L') {
				lAndR--;
			} else {
				lAndR++;
			}
		}
		return (lAndR == 0) && (dAndU == 0);
	}
}