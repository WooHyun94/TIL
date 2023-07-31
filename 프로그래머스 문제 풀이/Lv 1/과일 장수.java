import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        ArrayList<Integer> arr = new ArrayList<>();
        int kCheck = 0;
        
        for (int i = score.length - 1; i >= 0; i--){
            kCheck++;
            arr.add(score[i]);
            
            if(arr.size() == m){
                kCheck = 0;
                answer += (m * arr.get(m - 1));
                arr.clear();
            }
        }
        return answer;
    }
}