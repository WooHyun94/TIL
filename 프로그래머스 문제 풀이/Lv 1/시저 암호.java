import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++){
            if (String.valueOf(s.charAt(i)).equals(" ")){
                answer += " "; 
            }else{
                if ((int)s.charAt(i) < 97){
                    answer += String.valueOf((char)((((int)s.charAt(i) - 65 + n) % 26) + 65));
                }else{
                    answer += String.valueOf((char)((((int)s.charAt(i) - 97 + n) % 26) + 97));
                }
            }
        }
        return answer;
    }
}