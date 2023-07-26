class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int x = n < m ? n : m;
        for (int i = 1; i <= x; i++){
            if (n % i == 0 && m % i == 0) answer[0] = i;
        }
        x = n > m ? n : m;
        answer[1] = x;
        while (!(x % n == 0 && x % m == 0)){
            answer[1] = ++x;
        }
        return answer;
    }
}