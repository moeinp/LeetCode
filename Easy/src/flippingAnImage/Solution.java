package flippingAnImage;

class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			int a = 0;
			int b = A[i].length - 1;
			while (a < b) {
				int temp = A[i][a];
				A[i][a] = A[i][b];
				A[i][b] = temp;
				a++;
				b--;
			}
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = 1 - A[i][j];
			}
		}
		return A;
	}
}