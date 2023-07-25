class Solution {
    public long solution(long n) {
        long answer = -1;
        boolean check = false;
        for(int i = 1; i <= n; i++){
            if (n == Math.pow(i, 2)) {
                return (long)Math.pow(i + 1, 2);
            }
        }
        return answer;
    }
}