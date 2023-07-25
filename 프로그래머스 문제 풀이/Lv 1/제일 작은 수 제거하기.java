import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(arr2);
        int[] answer = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == arr2[0]) continue; 
            answer[j] = arr[i];
            j++;
        }
        if (answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}