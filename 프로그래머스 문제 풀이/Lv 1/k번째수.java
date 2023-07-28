import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> check = new ArrayList<>();
        for (int[] command : commands){
            check.clear();
            for (int i = command[0] - 1; i <= command[1] - 1; i++){
                check.add(array[i]);
            }
            Collections.sort(check);
            arr.add(check.get(command[2] - 1));
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}