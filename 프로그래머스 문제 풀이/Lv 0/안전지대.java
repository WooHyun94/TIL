class Solution {
    public int width, height;
    public int solution(int[][] board) {
        int answer = 0;
        height = board.length;
        width = board[0].length;
        
        for (int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if (board[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++){
                        for (int l = j - 1; l <= j + 1; l++){
                            try{
                                if (board[k][l] == 0) board[k][l] = 2;
                            }finally{
                                continue;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if (board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}