import java.util.*;

class Solution {
    public ArrayList solution(String my_str, int n) {
        ArrayList<String> array = new ArrayList<>();
        char[] c = my_str.toCharArray();
        int i = 0;
        String s = "";
        while (i < my_str.length()){
            s = "";
            for (int j = 0; j < n; j++){
                try{
                    s += String.valueOf(c[i]);
                    i++;
                }catch(ArrayIndexOutOfBoundsException e){
                    continue;
                }
                
            }
            array.add(s);
        }
        String[] answer = {};
        return array;
    }
}