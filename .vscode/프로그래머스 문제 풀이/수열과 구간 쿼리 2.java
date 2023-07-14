import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        ArrayList<Integer> array = new ArrayList<>();
        for(int[] query : queries){
            int minNum = 1000001;
            for (int i = query[0]; i <= query[1]; i++){
                if (arr[i] > query[2] && minNum > arr[i]){
                    minNum = arr[i];
                }
            }
            if (minNum > 1000000){
                minNum = -1;
            }
            array.add(minNum);
        }
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++){
            answer[i] = array.get(i).intValue();
        }
        return answer;
    }
}