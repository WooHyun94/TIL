class Solution {
    public int solution(int a, int b) {
        int answer;
        int x = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int y = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        answer = x > y ? x : y;
        return answer;
    }
}