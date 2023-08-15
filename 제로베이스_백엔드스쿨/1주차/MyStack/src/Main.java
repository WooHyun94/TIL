import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] names = new int[N];
        for (int i = 0; i < N; i++) {
            names[i] = Integer.parseInt(br.readLine());
        }

        long[] oneBitCnt = new long[20]; // 각 자리마다 비트 1이 나온 개수를 저장할 객체

        for (int name : names) {
            int idx = 0;
            while (name > 0) {
                int bit = name % 2;
                if (bit == 1) oneBitCnt[idx]++;
                idx++;
                name = name / 2;
            }
        }

        long friendly = 0;
        for (int i = 0; i < oneBitCnt.length; i++) {
            // 전체 인원수에서 1의 개수를 빼면 0의 개수
            friendly += (long) (oneBitCnt[i] * (N - oneBitCnt[i])) << i;
        }
        System.out.println(friendly);
    }
}