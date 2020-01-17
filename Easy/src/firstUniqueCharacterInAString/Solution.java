package firstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        int uniqIndex = Integer.MAX_VALUE;
        Map <Character, Integer> checkUniq = new HashMap <Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            if(!checkUniq.containsKey(s.charAt(i))){
                checkUniq.put(s.charAt(i), i);
            }
            else if(checkUniq.containsKey(s.charAt(i))){
                checkUniq.put(s.charAt(i), -1);
            }
        }
        for(char c : checkUniq.keySet()){
            if(checkUniq.get(c) < uniqIndex && checkUniq.get(c) > -1){
                uniqIndex = checkUniq.get(c);
            }
        }
        if (uniqIndex == Integer.MAX_VALUE){
            uniqIndex = -1;
        }
        return uniqIndex;
    }
}