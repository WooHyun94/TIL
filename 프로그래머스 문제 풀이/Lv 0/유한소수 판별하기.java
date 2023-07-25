class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = String.valueOf((double)a / b);
        answer = s.length() >= 16 ? 2 : 1;
        return answer;
    }
}