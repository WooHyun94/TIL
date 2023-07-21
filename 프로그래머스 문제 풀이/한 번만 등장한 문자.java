import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        int check = 0;
        char[] c = s.toCharArray();
        
        for (int i = 0; i < c.length; i++){
            check = 0;
            for (int j = 0; j < c.length; j++){
                if (c[i] == c[j]){
                    check++;
                }
            }
            if (check == 1){
                arr.add(String.valueOf(c[i]));
            }
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++){
            answer += arr.get(i);
        }
        return answer;
    }
}