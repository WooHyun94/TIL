import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++){
            arr.add(my_string.substring(i));
        }
        answer = arr.contains(is_suffix) ? 1 : 0;
        return answer;
    }
}