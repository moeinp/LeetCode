package validPalindromeII;

class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() -1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return isPal(s.substring(i,j)) || isPal(s.substring(i + 1 , j + 1)); 
            }
            i = i + 1;
            j = j - 1;
        }
        return true;
    }
    public boolean isPal(String s) {
        int i = 0;
        int j = s.length() -1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
                }
            i = i + 1;
            j = j - 1;
        }
        return true;
    }    
}