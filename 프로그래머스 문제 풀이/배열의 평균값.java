import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        IntStream stream = Arrays.stream(numbers);
        answer = stream.average().orElse(0); 
        return answer;
    }
}