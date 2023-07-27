class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String a = "";
        String b = "";
        String check = "";
        for (int i = 0; i < arr1.length; i++){
            check = "";
            a = binary(arr1[i]);
            b = binary(arr2[i]);
            
            while(a.length() != n) a = "0" + a;
            while(b.length() != n) b = "0" + b;
            // System.out.println(a);
            // System.out.println(b);
            for (int j = 0; j < a.length(); j++){
                if (a.charAt(j)=='0' && b.charAt(j)=='0') check += " ";
                else if (a.charAt(j)=='1' || b.charAt(j)=='1') check += "#";
            }
            answer[i] = check;
        }
        
        return answer;
    }
    public String binary(int n){
        if (n / 2 == 0) return String.valueOf(n);
        return binary(n / 2) + String.valueOf(n % 2);
    }
}