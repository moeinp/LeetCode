package trapping_rain_water;

public class Rookie {
	public static void main(String[] args) {
		System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }) == 6);
		System.out.println(trap(new int[] { 1, 4, 6, 4, 0, 43, 23 }) == 8);
		System.out.println(trap(new int[] { 6, 0, 6 }) == 6);

	}

	public static int trap(int[] height) {
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
