package fizzBuzz;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> fizzBuzz(int n) {
         List<String> fBList = new ArrayList<String>();
        for (int i = 1; i <= n; i ++ ){
            String s = "";
            if ((i % 3) == 0){
                s = s + "Fizz";
            }
            if ((i % 5) == 0){
                s = s + "Buzz";
                
            }if (((i % 3) != 0)&&((i % 5) != 0)){
                s = Integer.toString(i);
            }
            fBList.add(s);
        }
        return fBList;
    }
}