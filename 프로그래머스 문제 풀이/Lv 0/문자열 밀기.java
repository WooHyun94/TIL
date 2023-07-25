class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        char[] aChar = A.toCharArray();
        String str = "";
        
        for (int i = 0; i < aChar.length; i++){
            str = "";
            for (int j = A.length() - i; j < A.length() - i + A.length(); j++){
                
                str += String.valueOf(aChar[j % A.length()]);
            }
            
            if (str.equals(B)){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}