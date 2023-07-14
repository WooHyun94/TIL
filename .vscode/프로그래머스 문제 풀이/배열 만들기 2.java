import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        boolean check = false;
        
        for (int i = l; i <= r; i++){
            check = false;
            for (int j=1; j<=9; j++){
                if (j == 5){
                    continue;
                }
                
                if (String.valueOf(i).contains(String.valueOf(j))){
                    check = true;
                }
            }
            if (!check){
                arr.add(i);
            }
        }
        
        int[] answer;
        if (arr.size() > 0){
            answer = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i).intValue();
            }
        }else{
            answer = new int[]{-1};
        }
        
        
        
        return answer;
    }
}