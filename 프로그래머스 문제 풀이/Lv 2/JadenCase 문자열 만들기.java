import java.util.regex.Pattern;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] c = s.split("");
        boolean check = false;
        for (int i = 0; i < s.length(); i++){
            if (Pattern.matches("^[a-zA-Z]*$", c[i]) && !check){
                answer += c[i].toUpperCase();
                check = true;
            }else{
                if(c[i].equals(" ")){
                    check = false;
                    answer += " ";
                } else{
                    answer += c[i].toLowerCase();
                    check = true;
                }
            }
        }
        return answer;
    }
}
