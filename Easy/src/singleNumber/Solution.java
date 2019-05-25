package singleNumber;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        Set <Integer>  tracker = new HashSet<Integer>();
        for (int i : nums){
            if (!tracker.contains(i)){
                tracker.add(i);
            }
            else {
                tracker.remove(i);
            }
        }
        for (int i : tracker){
            ans = i;
        }
        return ans; 
    }
}