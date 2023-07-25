class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d = 0;
        boolean check = true;
        if (common[2] - common[1] == common[1] - common[0]){
            d = common[2] - common[1];
        }else{
            d = common[2] / common[1];
            check = false;
        }
        answer = check ? common[common.length - 1] + d : common[common.length - 1] * d;
        return answer;
    }
}