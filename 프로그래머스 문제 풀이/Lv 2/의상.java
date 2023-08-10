import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashSet set = new HashSet();
        for (String[] s : clothes){
            set.add(s[s.length - 1]);
        }
        
        Hashtable<String, LinkedList> table = new Hashtable<>();
        
        for (String[] s : clothes){
            String key = s[s.length - 1];
            for (int i = 0; i < s.length - 1; i++){
                if(table.get(key) == null) {
                    table.put(key, new LinkedList());
                }
                table.get(key).add(s[i]);
            }
        }
        int answer = 1;
        
        Iterator it = set.iterator();
        while(it.hasNext()){
            answer *= (table.get(it.next()).size() + 1);
        }
        answer--;
        return answer;
    }
}