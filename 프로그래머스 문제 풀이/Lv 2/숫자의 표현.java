class Solution {
    public int solution(int n) {
        int answer = 0;
        int check = 0;
        
        Loop:
        for (int i = 1; i <= n; i++){
            check = 0;
            for (int j = i; j <= n; j++){
                check += j;
                
                if(check == n){
                    answer++;
                    continue Loop;
                }else if(check > n){
                    break;
                }
            }
        }
        
        return answer;
    }
}
