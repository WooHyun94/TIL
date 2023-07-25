import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] cp = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(cp);
        
        for (int i = 0; i < emergency.length; i++) {
            int rank = Arrays.binarySearch(cp, emergency[i]);
            answer[i] = cp.length - rank;
        }

        return answer;
    }
}
