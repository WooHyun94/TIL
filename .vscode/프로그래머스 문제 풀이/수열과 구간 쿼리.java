class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int swap;
        for (int[] query : queries){
            swap = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = swap;
        }
        return arr;
    }
}