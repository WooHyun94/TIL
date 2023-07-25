class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] arr = myString.toCharArray();
        char[] arr2 = pat.toCharArray();
        for(int i = 0; i < arr.length; i++){
            String check = String.valueOf(arr[i]);
            if (check.equals("A")){
                arr[i] = 'B';
            }else if (check.equals("B")){
                arr[i] = 'A';
            }
        }
        
        for(int i = 0; i < arr.length - arr2.length + 1; i++){
            boolean c = true;
            for (int j = i; j < i + arr2.length; j++){
                if (!String.valueOf(arr[j]).equals(String.valueOf(arr2[j - i]))){
                    c = false;
                    break;
                }
            }
            if (c){
                answer = 1;
            }
        }
        
        
        return answer;
    }
}