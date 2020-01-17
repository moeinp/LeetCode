package peakIndexInAMountainArray;

class Solution {
	public int peakIndexInMountainArray(int[] A) {
		int[] j = { 0, 1, 2, 8, 5, 4, 3 };
		int left = 0;
		int right = j.length - 1;
		while (left < right) {
			int mid = (left + (right - left)) / 2;
			if (j[mid] < j[mid + 1]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return right;
	}
}