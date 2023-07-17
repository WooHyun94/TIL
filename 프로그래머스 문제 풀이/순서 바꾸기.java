import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int check = 0;
        for(int i : Arrays.copyOfRange(num_list, n, num_list.length)){
            answer[check] = i;
            check++;
        }
        
        for(int i : Arrays.copyOfRange(num_list, 0, n)){
            answer[check] = i;
            check++;
        }
        return answer;
    }
}