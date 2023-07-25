import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).map((x) -> x * 2).toArray();;
        return answer;
    }
}