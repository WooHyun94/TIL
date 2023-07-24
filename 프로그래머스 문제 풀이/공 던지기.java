import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< numbers.length; i++){
            arr.add(numbers[i]);
        }
        for (int i = 0; i < k - 1; i++){
            arr.add(arr.get(0));
            arr.remove(0);
            arr.add(arr.get(0));
            arr.remove(0);
        }
        answer = arr.get(0);
        return answer;
    }
}
