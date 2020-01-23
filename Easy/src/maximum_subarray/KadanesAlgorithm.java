package maximum_subarray;

public class KadanesAlgorithm {
	public static void main(String[] args) {
		maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
	}

	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max + nums[i] > max) {
				max = max + nums[i];
			}
			
		}
		return 0;
	}
}
