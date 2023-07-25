import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (int i = 1; i < 4; i++){
            array.remove(Integer.valueOf(i));
            System.out.println(array.toString());
            if (((double)(dots[0][0] - dots[i][0]) / (double)(dots[0][1] - dots[i][1]))
               == ((double)(dots[array.get(0)][0] - dots[array.get(1)][0]) / (double)(dots[array.get(0)][1] - dots[array.get(1)][1]))) return 1;
            array.add(i);
            
        }
        
        return answer;
    }
}

