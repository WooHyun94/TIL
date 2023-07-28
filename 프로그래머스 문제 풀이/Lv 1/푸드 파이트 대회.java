class Solution {
    public String solution(int[] food) {
        String answer = "";
        String check = "";
        for (int i = 1; i < food.length; i++){
            for (int j = 0; j < food[i] / 2; j++){
                check += String.valueOf(i);
            }
        }
        answer = check + "0" + new StringBuffer(check).reverse().toString();
        return answer;
    }
}