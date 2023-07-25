import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int _x = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
        answer = x % _x == 0 ? true : false;
        return answer;
    }
}