import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // 값 추가
        map.put("1번", 10);
        map.put("2번", 20);
        map.put("3번", 30);

        // 값 호출
        // HashMap.get(key);
        System.out.println(map.get("1번")); // 10

        // 값 제거
        // HashMap.remove(key);
        map.remove("1번");
        //map.clear(); // 모든 값 제거

        // 하나씩 출력
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
        }
    }
}
