import java.util.*;
class Solution {
    public ArrayList solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        String s = "";
        char[] str = my_string.toCharArray();
        
        for (int i = 0; i < str.length; i++){
            String check = String.valueOf(str[i]);
            if(check.equals(" ")){
                if (s.length() > 0){
                    answer.add(s);
                }
                s = "";
                continue;
            }else{
                s += check;
            }
        }
        
        if (s.length() > 0){
            answer.add(s);
        }
        
        return answer;
    }
}