import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        long result = 0;
        long count0, count1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int maxLength = 0;
        for (int num : arr) {
            maxLength = Math.max(maxLength, Integer.toBinaryString(num).length());
        }

        for (int i = 0; i < maxLength; i++) {
            count0 = 0;
            count1 = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) == 0) {
                    count0++;
                } else {
                    count1++;
                }
            }
            result += (count0 * count1) * (1 << i);
        }

        System.out.println(result);
    }
}
