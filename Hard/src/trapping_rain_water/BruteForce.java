package trapping_rain_water;

public class BruteForce {
	public static void main(String[] args) {
		System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }) == 6);
		System.out.println(trap(new int[] { 1, 4, 6, 4, 0, 43, 23 }) == 8);
		System.out.println(trap(new int[] { 6, 0, 6 }) == 6);
		System.out.println();
		System.out.println(trap2(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }) == 6);
		System.out.println(trap2(new int[] { 1, 4, 6, 4, 0, 43, 23 }) == 8);
		System.out.println(trap2(new int[] { 6, 0, 6 }) == 6);

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

	public static int trap2(int[] height) {
		if (height.length < 1) {
			return 0;
		}
		int totalTrapped = 0;
		for (int i = 1; i < height.length - 1; i++) {
			int leftMax = 0;
			for (int j = 0; j < i; j++) {
				leftMax = Math.max(leftMax, height[j]);
			}
			int rightMax = 0;
			for (int j = i + 1; j < height.length; j++) {
				rightMax = Math.max(rightMax, height[j]);
			}
			if (Math.min(leftMax, rightMax) - height[i] > 0) {
				totalTrapped += Math.min(leftMax, rightMax) - height[i];
			}
		}

		return totalTrapped;

	}

}
