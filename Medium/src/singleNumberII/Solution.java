package singleNumberII;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer > seen = new HashMap<Integer, Integer>();
        for(int i : nums){
            seen.put(i,seen.getOrDefault(i,0) + 1);
            if(seen.get(i) == 3){
                seen.remove(i);
            }
        }
        int result = 0;
        for (int i : seen.keySet()) {
        	result = i;
        }
        return result;
    }
}