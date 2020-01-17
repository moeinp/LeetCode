package validAnagram;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        if(s.length()!=t.length()) return false;
        for(char c : s.toCharArray()){
        	map[c-'a']++;
        }
        for(char c : t.toCharArray()){
        	if(map[c-'a']-- == 0){
        		return false;
        	}
        }
        return true;
    }
}