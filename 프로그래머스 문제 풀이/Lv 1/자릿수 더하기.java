import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = Arrays.stream(String.valueOf(n).split("")).mapToInt((x) -> Integer.parseInt(x)).sum();

        return answer;
    }
}