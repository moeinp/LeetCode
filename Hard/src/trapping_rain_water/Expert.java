package trapping_rain_water;

public class Expert {
	public static void main(String[] args) {
		System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }) == 6);
		System.out.println(trap(new int[] { 1, 4, 6, 4, 0, 43, 23 }) == 8);
		System.out.println(trap(new int[] { 6, 0, 6 }) == 6);
		System.out.println();
		
	}

	public static int trap(int[] height) {
		if (height.length < 1) {
			return 0;
		}
		int totalTrapped = 0;
		int indexOfMax = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[i] >= height[indexOfMax]) {
				indexOfMax = i;
			}
		}

		int smallMax = height[0];
		for (int j = 0; j < indexOfMax; j++) {
			if (smallMax - height[j] > 0) {
				totalTrapped += smallMax - height[j];
			}
			smallMax = Math.max(smallMax, height[j]);
		}

		smallMax = height[height.length - 1];
		for (int k = height.length - 1; k > indexOfMax; k--) {
			if (smallMax - height[k] > 0) {
				totalTrapped += smallMax - height[k];
			}
			smallMax = Math.max(smallMax, height[k]);
		}
		return totalTrapped;

	}

}
