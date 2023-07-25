import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> ma = new HashMap<>();
        
        for (String s : strArr){
            if (ma.keySet().contains(s.length())){
                ma.put(s.length(), ma.get(s.length()) + 1);
            }else{
                ma.put(s.length(), 1);
            }
            
        }
        
        for (int i : ma.values()){
            answer = Math.max(answer, i);
        }
        
        return answer;
    }
}