import java.util.*;
class Solution {
    public Stack solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            if(stk.isEmpty()){
                stk.push(arr[i]);
            }else if (!stk.empty() && stk.peek() == arr[i]){
                stk.pop();
            }else if (!stk.empty() && stk.peek() != arr[i]){
                stk.push(arr[i]);
            }
        }
        if(stk.empty()){
            stk.push(-1);
        }
        return stk;
    }
}