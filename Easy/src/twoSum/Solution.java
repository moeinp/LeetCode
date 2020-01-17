package twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];
        int firstNum = 0;        
        Map<Integer, Integer> numAndIndex = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            firstNum = target - nums[i];
            if (numAndIndex.containsKey(firstNum)){
                n[0] = i;
                n[1] = numAndIndex.get(firstNum);
                return n;
            }
            numAndIndex.put(nums[i], i);

        }
        return n; 
    }
}