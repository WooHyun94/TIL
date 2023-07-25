class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int a = 0;
        int b = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') a++;
            else if (s.charAt(i) == 'y') b++;
        }
        answer = a == b ? true : false;
        return answer;
    }
}