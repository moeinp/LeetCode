package intersectionOfTwoArrays;

import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Elements = new HashSet<Integer>();
        HashSet<Integer> intersection = new HashSet<Integer>();

        for(int i : nums1){
            nums1Elements.add(i);
        }
        for(int i : nums2){
            if(nums1Elements.contains(i))
            intersection.add(i);
        }
        int index = 0;
        int[] result = new int[intersection.size()];
        for (int i : intersection){
            result[index] = i;
            index = index + 1;
        }
        return result;
    }
}