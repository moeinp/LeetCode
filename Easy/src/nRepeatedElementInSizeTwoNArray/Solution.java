package nRepeatedElementInSizeTwoNArray;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int repeatedNTimes(int[] A) {
		Set<Integer> sums = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (sums.contains(A[i])) {
				return A[i];
			}
			sums.add(A[i]);
		}
		return -1;
	}
}