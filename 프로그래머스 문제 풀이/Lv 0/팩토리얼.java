import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for (int i = 1; i < 10; i++){
            arr.add(arr.get(i-1) * (i+1));
        }
        int answer = 0; 
        for (int i = 0; i < 10; i++){
            if(n >= arr.get(i)){
                answer = i + 1;
            }else{
                break;
            }
        }
        return answer;
    }
}