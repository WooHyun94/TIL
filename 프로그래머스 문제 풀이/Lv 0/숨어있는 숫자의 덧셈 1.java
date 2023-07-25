import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] c = my_string.toCharArray();
        for (int i = 0; i < c.length; i++){
            try{
                answer += Integer.parseInt(String.valueOf(c[i]));
            }catch(NumberFormatException e){
                continue;
            }
            
        }
        return answer;
    }
}