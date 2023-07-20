import java.util.*;
public class Main {
    public static void solution(int num) {
        if (num >= 0){
            StringBuffer arr = new StringBuffer(String.valueOf(num));

            System.out.println(Integer.parseInt(arr.reverse().toString()));
        }else{
            StringBuffer arr = new StringBuffer(String.valueOf(num).replace("-", ""));

            System.out.println("-" + Integer.parseInt(arr.reverse().toString()));
        }
    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }
}
