import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int check = 0;
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(String[] photo : photos){
            check = 0;
            for (int i = 0; i < photo.length; i++){
                if(map.containsKey(photo[i])) check += map.get(photo[i]);
            }
            arr.add(check);
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}