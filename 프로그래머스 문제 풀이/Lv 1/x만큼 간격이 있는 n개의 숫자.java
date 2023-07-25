import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> arr = new ArrayList<>();
        long k = x;
        while(arr.size() != n){
            arr.add(k);
            k += x;
        }
        long[] answer = new long[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}