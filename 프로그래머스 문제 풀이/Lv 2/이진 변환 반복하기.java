class Solution {
    public int cnt = 0;
    public int cnt_0 = 0;
    
    public int[] solution(String s) {
        binary(s);
        int[] answer = {cnt, cnt_0};
        return answer;
    }
    
    public void binary(String s){
        if(s.equals("1")) return;
        cnt++;
        StringBuffer sb = new StringBuffer();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            if (arr[i] == '1') sb.append(arr[i]);
            else cnt_0++;
        }
        binary(Integer.toBinaryString(sb.length()));
    }
}
