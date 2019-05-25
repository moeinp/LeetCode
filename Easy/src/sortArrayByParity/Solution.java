package sortArrayByParity;

class Solution {
	public int[] sortArrayByParity(int[] A) {
		int left = 0;
		int right = A.length - 1;
		int[] sortedArray = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			if ((A[i] % 2) == 0) {
				sortedArray[left] = A[i];
				left = left + 1;
			} else {
				sortedArray[right] = A[i];
				right--;
			}
		}
		return sortedArray;
	}
}