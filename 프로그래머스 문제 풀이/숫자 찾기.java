class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        char[] c = String.valueOf(num).toCharArray();
        for (int i = 0; i < c.length; i++){
            if (Integer.parseInt(String.valueOf(c[i])) == k){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}