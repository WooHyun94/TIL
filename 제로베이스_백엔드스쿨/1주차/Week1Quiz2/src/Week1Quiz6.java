import java.util.Random;
import java.util.Scanner;

public class Week1Quiz6 {
    /*
    우현
    가상 선거 및 당선 시뮬레이션 프로그램
    * */
    public static void main(String[] args) {
        int count, n;
        String[] people;
        int[] votes;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int check;

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        count = Integer.parseInt(sc.nextLine());
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        n = Integer.parseInt(sc.nextLine());

        people = new String[n];
        votes = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print(String.format("%d번째 후보자 이름을 입력해 주세요.", i + 1));
            people[i] = sc.nextLine();
        }
        System.out.println();
        for (int i = 0; i < count; i++){
            check = rnd.nextInt(n);
            votes[check]++;

            System.out.printf("[투표진행률]: %.2f%% %d명 투표 => %s\n", (float)(i + 1) / count * 100, i + 1, people[check]);
            for (int j = 0; j < n; j++){
                System.out.printf("[기호:%d] %s:\t%.2f%%\t(투표수: %d)\n", j + 1, people[j], (float)votes[j] / count * 100, votes[j]);
            }
            System.out.println("");
        }

        check = 0;
        for(int i = 1; i < n; i++){
            if (votes[check] < votes[i]) check = i;
        }

        System.out.println(String.format("[투표결과] 당선인 : %s\n", people[check]));
    }
}
