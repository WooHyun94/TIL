import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> dq = new LinkedList<>();
        
        for (int i : people) dq.add(i);
        //System.out.println(dq);
        while(dq.size() != 0){
            if (dq.peekFirst() + dq.peekLast() > limit){
                dq.removeLast();
            }else{
                dq.pollFirst();
                dq.pollLast();
            }
            answer++;
        }
        
        
        return answer;
    }
}
