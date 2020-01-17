package ransomNote;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineCount = new HashMap<Character, Integer>();
        for (char letter : magazine.toCharArray()){
            magazineCount.put(letter, magazineCount.getOrDefault(letter, 0) + 1);
        }
        for (char letter : ransomNote.toCharArray()){
            if (!magazineCount.containsKey(letter) || magazineCount.get(letter) < 1){
                return false;
            }
            magazineCount.put(letter, magazineCount.get(letter) -1);
        }
        return true;
    }
}