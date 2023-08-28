import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][n];
        long[][] check = new long[n][n];
        String[] s;

        for(int i = 0; i < n; i++){
            s = sc.nextLine().split(" ");

            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        check[0][0] = 1;

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(check[i][j] == 0 || arr[i][j] == 0){
                    continue;
                }

                int x = i;
                int y = j;

                if(x == n - 1 && y == n - 1){
                    break;
                }

                int right = y + arr[x][y];
                int down = x + arr[x][y];
                if(right < n) {
                    check[x][right] += check[x][y];
                }

                if(down < n){
                    check[down][y] += check[x][y];
                }
            }
        }

        System.out.println(check[n - 1][n - 1]);
    }
}