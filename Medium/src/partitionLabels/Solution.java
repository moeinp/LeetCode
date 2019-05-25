package partitionLabels;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int lastOcurence = 0;
        int j = 0;
        for(int i = 0; i < S.length(); i++){
            if (S.lastIndexOf(S.charAt(i)) > lastOcurence){
                lastOcurence = S.lastIndexOf(S.charAt(i));
            }
            if(i == lastOcurence){
                    result.add((i+1) - j);
                    j = i + 1;
                }
            }
        return result;
    }
}