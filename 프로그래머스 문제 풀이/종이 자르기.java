class Solution {
    public int solution(int m, int n) {
        int answer = 0;
        int a = (n-1 + n*(m-1));
        int b = (m-1)+m*(n-1);
        answer = a>b?b:a;
        return answer;
    }
}