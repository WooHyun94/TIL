class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (String[] ip : db){
            if (id_pw[0].equals(ip[0])){
                if(id_pw[1].equals(ip[1])){
                    return "login";
                }else{
                    return "wrong pw";
                }
            }else{
                continue;
            }
        }
        return answer;
    }
}