class Solution {
    int check = 0;
    
    public int solution(int n) {
        int answer = 0;
        check = binary(n);
        n++;
        while(binary(n) != check){
            n++;
        }
        answer = n;
        return answer;
    }
    
    public int binary(int n){
        int result = 0;
        char[] c = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < c.length; i++){
            if(c[i] == '1') result++;
        }
        return result;
    }
}