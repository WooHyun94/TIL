import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int check = 0;
        String a = "";
        for (int i = 0; i < s.length(); i++){
            a = String.valueOf(s.charAt(i)); 
            if(a.equals(" ")){
                answer += " ";
                check = 0;
            }else{
                if(check % 2 == 0){
                    answer += a.toUpperCase();
                }else{
                    answer += a.toLowerCase();
                }
                check++;
            }
        }
        
        return answer;
    }
}