import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        char[] c = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        
        for (int i = 0; i < c.length; i++){
            if (!stk.isEmpty() && stk.peek() == c[i]) stk.pop();
            else stk.push(c[i]);
        }
        
        answer = stk.size() == 0 ? 1 : 0;
        
        
        return answer;
    }
}