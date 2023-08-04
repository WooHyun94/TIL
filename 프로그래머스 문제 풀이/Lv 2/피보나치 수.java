import java.util.*;

class Solution {
    public HashMap<Integer, Integer> memo = new HashMap<>();
    public static final int MOD = 1234567;
    
    public int solution(int n) {
        long result = 0l;
        long[] arr = {0, 1};
        long l;
        
        for (int i = 2; i <= n; i++){
            l = (arr[0] + arr[1]) % 1234567;
            if (i % 2 == 0) arr[0] = l;
            else arr[1] = l;
        }
        result = (n % 2 == 0) ? arr[0] : arr[1];
        
        return (int)result;
    }
}
