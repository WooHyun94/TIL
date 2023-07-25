class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = false;
        for (int i = 1; i < n; i++){
            if ((int)Math.pow(i, 2) == n){
                check = true;
                break;
            }
        }
        answer = check ? 1 : 2;
        return answer;
    }
}