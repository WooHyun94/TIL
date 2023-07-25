import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 10; i++){
            arr.add(i);
        }
        for (int num : numbers){
            arr.remove(Integer.valueOf(num));
        }
        int answer = arr.stream().mapToInt(x -> x).sum();
        return answer;
    }
}