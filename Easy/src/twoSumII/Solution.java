package twoSumII;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        while (left < right ){
            sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[] {left+1, right+1};
            }
            if(sum> target){
                right = right - 1;
            }else{
                left = left + 1;
            }
        }
        return new int[] {-1, -1};
    }
}