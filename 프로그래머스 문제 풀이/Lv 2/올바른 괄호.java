import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stk = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!stk.isEmpty() && c==')') {
                stk.pop();
                continue;
            }
            stk.push(c);
        }
        answer = stk.isEmpty() ? true : false;
        return answer;
    }
}