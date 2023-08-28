import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int target = Integer.parseInt(s[1]);

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int idx = n - 1;

        while(target > 0){
            if (arr[idx] > target){
                idx--;
            }else{
                result += target / arr[idx];
                target %= arr[idx];
            }
        }
        System.out.println(result);
    }
}