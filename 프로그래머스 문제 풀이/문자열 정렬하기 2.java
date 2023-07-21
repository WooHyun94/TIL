import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        String answer = "";
        for(char ch : c){
            answer += String.valueOf(ch);
        }
        return answer;
    }
}