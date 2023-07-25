class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] strs = new char[my_string.length()];
        strs = my_string.toCharArray();
        for (int i = 0; i < strs.length; i++){
            if((int)strs[i] < 97){
                answer[(int)strs[i]-65]++;    
            }else{
                answer[(int)strs[i]-97 + 26]++;
            }
            
        }
        return answer;
    }
}