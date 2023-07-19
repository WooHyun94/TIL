class Solution {
    public String solution(String a, String b) {
        String answer = "";
        StringBuffer aSb = new StringBuffer(a);
        StringBuffer bSb = new StringBuffer(b);
        aSb = aSb.reverse();
        bSb = bSb.reverse();
        char[] aArray = aSb.toString().toCharArray();
        char[] bArray = bSb.toString().toCharArray();
        StringBuffer result = new StringBuffer();
        
        int lenBool = (aSb.length() > bSb.length()) ? 1 : 0;
        int len = lenBool == 1 ? aSb.length() : bSb.length();
        int n10 = 0;
        for (int i = 0; i < len; i++){
            int n;
            try{
                n = Integer.parseInt(String.valueOf(aArray[i])) + Integer.parseInt(String.valueOf(bArray[i])) + n10;
            }catch(ArrayIndexOutOfBoundsException e){
                n = lenBool == 1? Integer.parseInt(String.valueOf(aArray[i])) + n10 : Integer.parseInt(String.valueOf(bArray[i])) + n10;
            }
            
            
            if (n >= 10){
                n10 = 1;
                result.append(String.valueOf(n % 10));
            }else{
                result.append(String.valueOf(n));
                n10 = 0;
            }
        }
        if (n10 == 1){
            result.append("1");
        }
        answer = result.reverse().toString();
        return answer;
    }
}