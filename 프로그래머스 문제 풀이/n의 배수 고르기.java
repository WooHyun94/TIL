import java.util.*;
class Solution {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i : numlist){
            if(i % n == 0){
                array.add(i);
            }
        }
        
        return array;
    }
}