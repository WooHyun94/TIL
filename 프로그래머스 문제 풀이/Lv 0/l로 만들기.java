class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] c = myString.toCharArray();
        for(int i = 0; i < c.length; i++){
            if ((int)c[i] < (int)'l'){
                c[i] = 'l';
            }
        }
        answer = new String(c);
        return answer;
    }
}