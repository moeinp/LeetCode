package containsDuplicate;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupTracker = new HashSet<Integer>();
        for (int i : nums){
            if (dupTracker.contains(i)){
                return true;
            }
            dupTracker.add(i);
        }
        return false;
    }
}
