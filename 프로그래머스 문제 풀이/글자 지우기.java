import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        ArrayList arr = new ArrayList();
        for (int i = 0; i < indices.length; i++){
            arr.add(indices[i]);
        }
        arr.sort(Comparator.naturalOrder());
        char[] str = my_string.toCharArray();
        for (int i = 0; i < str.length; i++){
            if (arr.contains(i)){
                continue;
            }
            answer += String.valueOf(str[i]);
        }
        return answer;
    }
}