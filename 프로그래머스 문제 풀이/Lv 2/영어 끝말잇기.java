import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++){
            if (arr.indexOf(words[i]) != -1  // 이미 있거나
                || 
               (arr.size() != 0 
               &&arr.get(arr.size() - 1).charAt(arr.get(arr.size() - 1).length() - 1) != 
               words[i].charAt(0)) // 마지막 글자와 시작하는 글자가 다르다면
               ||
               words[i].length() == 1) { // 한글자라면
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }else{
                arr.add(words[i]);    
            }
        }
        

        return answer;
    }
}
