import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] arr = new int[n];
        s = sc.nextLine().split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        int start = 0, end = 0;
        int result = 0;

        while(start < n){
            int now = 0;

            for (int i = start; i <= end; i++){
                now += arr[i];
            }

            if (now >= m){
                start++;

                if(now == m){
                    result++;
                }
            }else{
                if(end < n - 1){
                    end++;
                }else{
                    break;
                }
            }
        }
        System.out.println(result);
    }
}