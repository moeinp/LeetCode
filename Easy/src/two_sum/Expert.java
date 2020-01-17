package two_sum;

import java.util.HashMap;
import java.util.Map;

public class Expert {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i <= nums.length; i++) {
			int secondNumb = target - nums[i];
			if (mp.containsKey(secondNumb)) {
				return new int[] { i, mp.get(secondNumb) };

			}
			mp.put(nums[i], i);
		}
		throw new IllegalArgumentException();
	}
}
