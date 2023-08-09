import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = arr[0], max = arr[0];

        for(int i : arr){
            if(min > i) min = i;
            if(max < i) max = i;
        }
        System.out.println(String.format("%d %d", min, max));
    }
}
