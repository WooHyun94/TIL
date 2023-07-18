class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] arr = myString.toCharArray();
        char[] patArr = pat.toCharArray();
        
        for (int i = 0; i < arr.length - patArr.length + 1; i++){
            boolean check = true;
            for (int j = i; j < i + patArr.length; j++){
                if (arr[j] != patArr[j - i]){
                    check = false;
                }
            }
            if (check){
                answer++;
            }
        }
        return answer;
    }
}

