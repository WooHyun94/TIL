import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int i = 0;
        
        while (true){
            i = 1;
            ans++;
            while(i < n){
                i = i * 2;
            }
            if (n == i) break;
            n -= i / 2;
        }

        return ans;
    }
}