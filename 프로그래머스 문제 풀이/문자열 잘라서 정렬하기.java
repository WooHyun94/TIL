import java.util.*;
class Solution {
    public ArrayList solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() > 0){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}