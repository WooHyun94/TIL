class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] nums = num_str.toCharArray();
        for(int i = 0; i < nums.length; i++){
            answer += Integer.parseInt(String.valueOf(nums[i]));
        }
        return answer;
    }
}