package maximum_subarray;

public class BruteForce {
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(maxSubArray(new int[] { -1, -1, 1, 1, 1, -1, -1, -1, -1, -1, 1 }));
	}

	public static int maxSubArray(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				int currSum = 0;
				for (int k = i; k <= j; k++) {
					currSum += nums[k];
				}
				max = Math.max(max, currSum);
			}
		}
		return max;
	}
}
