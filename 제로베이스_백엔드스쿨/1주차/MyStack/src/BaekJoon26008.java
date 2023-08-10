import java.util.Scanner;

public class BaekJoon26008 {
    public static void main(String[] args) {
        int n, m, a, hash;
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        a = Integer.parseInt(s[2]);

        hash = Integer.parseInt(sc.nextLine());

        long max = 0;
        for (int i = 0; i < n; i++){
            max += (m - 1) * Math.pow(a, i);
        }
        int answer = 0;
        int cnt = 0;
        while (true){
            if(max > (cnt * m + hash)){
                answer++;
                cnt++;
            }else{
                break;
            }
        }
        System.out.println(answer);
    }
}
