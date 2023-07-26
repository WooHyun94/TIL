import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuffer sb = new StringBuffer(get3(String.valueOf(n))).reverse();
        String s = String.valueOf(sb);
        int k = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            answer += (int)Math.pow(3, i) * Integer.parseInt(String.valueOf(s.charAt(k++)));
        }
        
        return answer;
    }
    public String get3(String n){
        if (Integer.parseInt(n) / 3 == 0){
            return n;
        }
        return get3(String.valueOf(Integer.parseInt(n) / 3)) 
               + String.valueOf(Integer.parseInt(n) % 3);
    }
}