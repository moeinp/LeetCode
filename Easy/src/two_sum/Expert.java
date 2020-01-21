package two_sum;

import java.util.HashMap;
import java.util.Map;

public class Expert {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> mp = new HashMap<>();
		// for each element nums[i] check to see if the HashMap has an element j (where j = target - nums[i])
		// if it does return the index of j and i else add  element num[i] and its index to HashMap
		for (int i = 0; i < nums.length; i++) {
			int secondNumb = target - nums[i];
			if (mp.containsKey(secondNumb)) {
				return new int[] { i, mp.get(secondNumb) };
			}
			mp.put(nums[i], i);
		}
		throw new IllegalArgumentException();
	}
}
