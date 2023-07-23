import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minIndex = 0;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++){
            int a = Math.abs(array[minIndex] - n);
            int b = Math.abs(array[i] - n);
            if (a > b){
                minIndex = i;
                answer = array[i];
            }
        }
        return answer;
    }
}