import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        int[] answer;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 2){
                array.add(i);
            }
        }
        if (array.isEmpty()){
            answer = new int[]{-1};
        }else{
            int start = array.get(0);
            int end = array.get(array.size() - 1);
            answer = new int[end - start + 1];
            for (int i = 0; i < end - start + 1; i++){
                answer[i] = arr[i + start];
            }
        }
        
        return answer;
    }
}