class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i <= k; i++){
            for (int j = 0; j <= k - i; j++){
                if (i + j <= k){
                    try{
                        answer += board[i][j];    
                    }catch(IndexOutOfBoundsException e){
                        continue;
                    }
                    
                }
            }
        }
        return answer;
    }
}