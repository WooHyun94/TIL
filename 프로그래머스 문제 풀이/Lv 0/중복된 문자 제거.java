import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++){
            arr.add(i);
        }
        for (int i = 0; i < my_string.length(); i++){
            for (int j = i + 1; j < my_string.length(); j++){
                if(my_string.charAt(i) == my_string.charAt(j)){
                    arr.remove(Integer.valueOf(j));
                }
            }
        }
        for(int i = 0; i < arr.size(); i++){
            answer += String.valueOf(my_string.charAt(arr.get(i).intValue()));
        }
        
        return answer;
    }
}