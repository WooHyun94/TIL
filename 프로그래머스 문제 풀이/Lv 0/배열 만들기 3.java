import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++){
            arr2.add(arr[i]);
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++){
            arr2.add(arr[i]);
        }
        int[] answer = new int[arr2.size()];
        for(int i = 0; i < arr2.size(); i++){
            answer[i] = arr2.get(i).intValue();
        }
        return answer;
    }
}