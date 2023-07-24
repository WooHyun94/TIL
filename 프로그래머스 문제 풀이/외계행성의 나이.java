import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        HashMap<String,String> map1 = new HashMap<String,String>();
        map1.put("0", "a");
        map1.put("1", "b");
        map1.put("2", "c");
        map1.put("3", "d");
        map1.put("4", "e");
        map1.put("5", "f");
        map1.put("6", "g");
        map1.put("7", "h");
        map1.put("8", "i");
        map1.put("9", "j");
        char[] c = String.valueOf(age).toCharArray();
        for(int i = 0; i < c.length; i++){
            answer += map1.get(String.valueOf(c[i]));
        }
        return answer;
    }
}