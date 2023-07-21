class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            if (Character.isUpperCase(my_string.toCharArray()[i])){
                answer += String.valueOf(my_string.toCharArray()[i]).toLowerCase();
            }else{
                answer += String.valueOf(my_string.toCharArray()[i]).toUpperCase();
            }
        }
        return answer;
    }
}