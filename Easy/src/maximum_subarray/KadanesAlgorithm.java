package maximum_subarray;

public class KadanesAlgorithm {
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(maxSubArray(new int[] { -1, -1, 1, 1, 1, -1, -1, -1, -1, -1, 1 }));
	}

	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
			max = Math.max(max, nums[i]);
		}
		return max;
	}
}
