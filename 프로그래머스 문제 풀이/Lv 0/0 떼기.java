class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] c = n_str.toCharArray();
        boolean check = false;
        for (int i = 0; i < c.length; i++){
            String s = String.valueOf(c[i]);
            
            if (!s.equals("0") && !check){
                check = true;          
            }
            if (check){
                answer += s;
            }
        }
        return answer;
    }
}