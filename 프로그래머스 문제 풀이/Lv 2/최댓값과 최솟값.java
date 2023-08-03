import java.util.*;

class Solution {
    public String solution(String s) {
        int[] c = Arrays.stream(s.split(" ")).map(Integer::parseInt).mapToInt(Integer::intValue).toArray();
        Arrays.sort(c);
        String answer = c[0] +" " + c[c.length - 1];
        return answer;
    }
}