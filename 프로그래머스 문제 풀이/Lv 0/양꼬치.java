class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int payN = 12000;
        int payK = 2000;
        answer = (payN * n) + (payK * (k - (n / 10)));
        return answer;
    }
}