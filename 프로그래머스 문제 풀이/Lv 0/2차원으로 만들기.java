class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[(int)Math.ceil((double)num_list.length/n)][n];
        int check = 0;
        for (int i = 0; i < answer.length; i++){
            for (int j= 0; j < answer[i].length; j++){
                answer[i][j] = num_list[check++];
            }
        }
        return answer;
    }
}