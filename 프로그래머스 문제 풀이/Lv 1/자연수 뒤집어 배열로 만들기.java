import java.util.*;

class Solution {
    public int[] solution(long n) {
        StringBuffer s = new StringBuffer(String.valueOf(n));
        s = s.reverse();
        int[] answer = Arrays.stream(s.toString().split(""))
                                                 .mapToInt(Integer::parseInt)
                                                 .toArray();
        return answer;
    }
}