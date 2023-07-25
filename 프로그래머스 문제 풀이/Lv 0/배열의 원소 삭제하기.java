import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            array.add(arr[i]);
        }
        for (int li : delete_list){
            array.remove(Integer.valueOf(li));
        }
        int[] answer = new int[array.size()];
        
        for(int i = 0; i < array.size(); i++){
            answer[i] = array.get(i).intValue();
        }
        return answer;
    }
}