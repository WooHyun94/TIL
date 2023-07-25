import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            int index = query[i];
            if (i >= 0 && index < arr.length) {
                if (i % 2 == 0) { // 짝수 인덱스 처리 (뒷부분 잘라내기)
                    arr = Arrays.copyOfRange(arr, 0, index + 1);
                } else { // 홀수 인덱스 처리 (앞부분 잘라내기)
                    arr = Arrays.copyOfRange(arr, index, arr.length);
                }
            }
        }
        return arr;
    }
}
