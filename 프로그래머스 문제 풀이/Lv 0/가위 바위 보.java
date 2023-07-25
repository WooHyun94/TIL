class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] c = rsp.toCharArray();
        for (int i = 0; i < c.length; i++){
            if (String.valueOf(c[i]).equals("2"))answer += "0";
            else if (String.valueOf(c[i]).equals("0"))answer += "5";
            else answer += "2";
        }
        return answer;
    }
}