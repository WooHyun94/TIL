import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i]) + 1);
            }else{
                map.put(array[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        
        if (entryList.size() == 1) answer = entryList.get(entryList.size() - 1).getKey();
        else if (entryList.get(entryList.size() - 1).getValue() == entryList.get(entryList.size() - 2).getValue()) return - 1;
        else answer = entryList.get(entryList.size() - 1).getKey();
        
        return answer;
    }
}