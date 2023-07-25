import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines){
            for (int i = line[0]; i < line[1]; i++){
                if(map.containsKey(i)) map.put(i, map.get(i) + 1);
                else map.put(i, 0);
            }
        }
        int answer = 0;
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        for (Map.Entry<Integer, Integer> entry : entryList){
            if (entry.getValue() != 0) answer++;
        }
        return answer;
    }
}