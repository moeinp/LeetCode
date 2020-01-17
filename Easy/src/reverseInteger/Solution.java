package reverseInteger;

class Solution {
    public int reverse(int x) {
        long y = 0;
        while (x != 0){
            y = y * 10;
            y = y + (x % 10);
            x = x / 10;
        }
        if (y < -2147483648 ||  y > 2147483647){
            return 0;
        }
        return (int)y;
    }
}