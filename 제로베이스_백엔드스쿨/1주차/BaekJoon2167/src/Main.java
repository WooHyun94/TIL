import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        String[] s = sc.nextLine().split(" ");

        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            s = sc.nextLine().split(" ");
            for (int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        int k = Integer.parseInt(sc.nextLine());
        String[] strArr = new String[k];
        for(int i = 0; i < k; i++){
            strArr[i] = sc.nextLine();
        }

        for(int i = 0; i < k; i++){
            s = strArr[i].split(" ");
            int result = 0;
            int x1 = Integer.parseInt(s[0]) - 1;
            int y1 = Integer.parseInt(s[1]) - 1;
            int x2 = Integer.parseInt(s[2]) - 1;
            int y2 = Integer.parseInt(s[3]) - 1;

            for(int l = x1; l <= x2; l++){
                for (int j = y1; j <= y2; j++){
                    result += arr[l][j];
                }
            }

            System.out.println(result);
        }
    }
}