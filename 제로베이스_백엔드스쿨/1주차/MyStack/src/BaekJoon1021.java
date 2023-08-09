import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BaekJoon1021 {
    public static void main(String[] args) {
        Deque dq = new ArrayDeque();
        Scanner sc = new Scanner(System.in);
        int nSize, count;
        String[] s;
        int result = 0;

        s = sc.nextLine().split(" ");
        nSize = Integer.parseInt(s[0]);
        count = Integer.parseInt(s[1]);

        s = sc.nextLine().split(" ");

        for (int i : IntStream.rangeClosed(1, nSize).toArray()){
            dq.addLast(i);
        }

        for (int i = 0; i < count; i++){
            if ((int)dq.peekFirst() == Integer.parseInt(s[i])){
                dq.removeFirst();
                continue;
            }

            int left = turnLeft((ArrayDeque)dq, Integer.parseInt(s[i]));
            int right = turnRight((ArrayDeque)dq, Integer.parseInt(s[i]));

            if(left <= right){
                result += left;
                for(int j = 0; j < left; j++) dq.addLast(dq.pollFirst());
            }else{
                result += right;
                for(int j = 0; j < right; j++) dq.addFirst(dq.pollLast());
            }

            dq.removeFirst();
        }

        System.out.println(result);
    }
    public static int turnLeft(ArrayDeque d, int num){
        Deque copy = d.clone();
        int leftCnt = 0;

        while(((int)copy.peekFirst() != num)){
            copy.addLast(copy.pollFirst());
            leftCnt++;
        }

        return leftCnt;
    }

    public static int turnRight(ArrayDeque d, int num){
        Deque copy = d.clone();
        int rightCnt = 0;

        while(((int)copy.peekFirst() != num)){
            copy.addFirst(copy.pollLast());
            rightCnt++;
        }

        return rightCnt;
    }
}
