package binarySearch;

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        if(nums[l] == target){
            return l;
        }
        while(l<r){
            int m = l + ((r - l) / 2);
            if(nums[l] == target){
                return l;
            }
            if(nums[r] == target){
                return r;
            }
            if(nums[m] == target){
                return m;
            }if(nums[m] < target){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return -1;
    }
}