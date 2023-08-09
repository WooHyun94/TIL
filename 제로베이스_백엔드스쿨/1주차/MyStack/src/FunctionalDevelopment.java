import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int progress : progresses) {
            progressQueue.offer(progress);
        }
        for (int speed : speeds) {
            speedQueue.offer(speed);
        }

        while (!progressQueue.isEmpty()) {
            int cnt = 0;

            for (int i = 0; i < progressQueue.size(); i++) {
                int progress = progressQueue.poll();
                int speed = speedQueue.poll();
                progress += speed;
                progressQueue.offer(progress);
                speedQueue.offer(speed);
            }

            while (!progressQueue.isEmpty() && progressQueue.peek() >= 100) {
                progressQueue.poll();
                speedQueue.poll();
                cnt++;
            }

            if (cnt != 0) {
                result.add(cnt);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
