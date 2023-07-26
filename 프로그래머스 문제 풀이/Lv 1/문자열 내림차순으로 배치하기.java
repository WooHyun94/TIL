import java.util.*;
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        ArrayList lower = new ArrayList();
        ArrayList upper = new ArrayList();
        
        for (int i = 0; i < c.length; i++){
            if ((int)c[i] >= 97) lower.add(String.valueOf(c[i]));
            else upper.add(String.valueOf(c[i]));
        }
        
        Collections.sort(lower, Collections.reverseOrder());
        Collections.sort(upper, Collections.reverseOrder());
        
        String answer = String.join("", lower) + String.join("", upper);
        return answer;
    }
}