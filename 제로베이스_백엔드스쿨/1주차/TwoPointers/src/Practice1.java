public class Practice1 {
    public static String solution(String s){
        if(s == null || s.length() == 0){
            return null;
        }

        int left = 0;
        int right = s.length() - 1;

        while(left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(right);

            while(left <= right && s.charAt(left) == c){
                left++;
            }

            while(left <= right && s.charAt(right) == c){
                right--;
            }
        }

        return s.substring(left, right + 1);
    }

    public static void main(String[] args){
        System.out.println(solution("ab"));
        System.out.println(solution("aaabbaa"));
        System.out.println(solution("aabcddba"));
    }
}
