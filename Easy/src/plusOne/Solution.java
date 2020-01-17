package plusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0]= 1;
        for (int i = 1; i < newDigits.length; i++){
            newDigits[i] = 0;
        }
        return newDigits;
    }
}