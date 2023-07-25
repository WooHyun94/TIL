class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer, denom;
        denom = denom1 * denom2;
        numer = (numer1 * denom2) + (numer2 * denom1);
        int minNum = numer < denom ? numer : denom;
        int gcd = 0;
        for (int i = 2; i <= minNum; i++){
            if(numer % i == 0 && denom % i == 0){
                gcd = i;
            }
        }
        if (gcd != 0){
            numer /= gcd;
            denom /= gcd;    
        }
        int[] answer = {numer, denom};
        return answer;
    }
}