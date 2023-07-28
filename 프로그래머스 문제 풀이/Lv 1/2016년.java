import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "MON");
        map.put(2, "TUE");
        map.put(3, "WED");
        map.put(4, "THU");
        map.put(5, "FRI");
        map.put(6, "SAT");
        map.put(7, "SUN");
        
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek week = date.getDayOfWeek();
        answer = map.get(week.getValue());
        return answer;
    }
}