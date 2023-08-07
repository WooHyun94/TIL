import java.util.*;

public class BaekJoon25556 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer>[] stks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stks[i] = new Stack<>();
        }
        String[] inputString = sc.nextLine().split(" ");
        for (String s : inputString) {
            arr.add(Integer.parseInt(s));
        }

        int idx = 0;
        boolean check = true;

        for (int i = 0; i < n; i++) {
            boolean inserted = false;
            for (int j = 0; j < 4; j++) {
                if (stks[j].isEmpty() || stks[j].peek() < arr.get(i)) {
                    stks[j].push(arr.get(i));
                    inserted = true;
                    break;
                }
            }
            if (!inserted) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
