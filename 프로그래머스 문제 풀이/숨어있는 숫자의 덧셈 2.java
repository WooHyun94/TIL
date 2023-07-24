class Solution {
    public static boolean isConvertibleToInt(String input) {
        try {
            int number = Integer.parseInt(input);
            return true; // 변환 가능한 경우
        } catch (NumberFormatException e) {
            return false; // 변환 불가능한 경우
        }
    }
    
    public int solution(String my_string) {
        int answer = 0;
        char[] c = my_string.toCharArray();
        String num = "";
        for (int i = 0; i < c.length; i++){
            if (isConvertibleToInt(String.valueOf(c[i]))){
                num += String.valueOf(c[i]);
            }else{
                num += " ";
            }
        }
        String[] s = num.split(" ");
        for (int i = 0; i < s.length; i++){
            if (isConvertibleToInt(s[i])) answer += Integer.parseInt(s[i]);
        }
        return answer;
    }
}