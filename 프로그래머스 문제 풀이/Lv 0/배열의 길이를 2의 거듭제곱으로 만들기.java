import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            array.add(arr[i]);
        }
        
        ArrayList<Integer> check = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            check.add((int)Math.pow(2, i));
        }
        
        while(!check.contains(array.size())){
            array.add(0);
        }
        return array;
    }
}