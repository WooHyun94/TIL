class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] str = new char[my_string.length()];
        str = my_string.toCharArray();
        char swap = 0;
        for (int i = s; i <= (s + e) / 2; i++){
            swap = str[(s + e ) - i];
            str[(s + e) - i] = str[i];
            str[i] = swap;
        }
        answer = String.valueOf(str);
        return answer;
    }
}