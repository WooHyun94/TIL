class Solution {
    public int[][] solution(int[][] arr) {
        int n = (arr.length > arr[0].length) ? arr.length : arr[0].length;
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                try{
                    answer[i][j] = arr[i][j];    
                }catch(ArrayIndexOutOfBoundsException e){
                    answer[i][j] = 0;
                }
                
            }
        }
        return answer;
    }
}