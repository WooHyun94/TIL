import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        if(stk.isEmpty()) {                 // true 반환
            System.out.println("empty");    // empty 출력
        }

        stk.push(1);
        System.out.println("stk = " + stk); // stk = [1]

        stk.push(5);
        System.out.println("stk = " + stk); // stk = [1, 5]

        System.out.println(stk.pop());      // 5
        System.out.println("stk = " + stk); // stk = [1]

        stk.push(2);
        System.out.println("stk = " + stk); // stk = [1, 2]

        System.out.println(stk.peek());     // 2
        System.out.println(stk.size());     // 2
    }
}
