class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char swap = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = swap;
        String answer = new String(arr);
        return answer;
    }
}