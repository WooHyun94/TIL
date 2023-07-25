import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        int check = 0;
        char[] c = my_string.toCharArray();
        for(int i = 0; i < my_string.length(); i++){
            try{
                arr.add(Integer.parseInt(String.valueOf(c[i])));
            }catch(NumberFormatException e){
                continue;
            }
            
        }
        Collections.sort(arr);
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}