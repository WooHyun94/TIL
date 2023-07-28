import java.util.*;
class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        char check = ' ';
        
        for (int i = 0; i < s.length(); i++){
            check = s.charAt(i);
            if (map.containsKey(check)) {
               arr.add(i - map.get(check));
                map.put(check, i);
            }else{
                map.put(check, i);
                arr.add(-1);
            }
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}