import java.util.*;

class Solution {
    public long solution(long n) {
        Integer[] c = Arrays.stream(String.valueOf(n).split("")).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(c, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (int num : c) {
            sb.append(num);
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}
