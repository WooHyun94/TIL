import java.util.*;

public class Week1Quiz7 {
    /*
    * 우현
    * 로또 당첨 프로그램
    * */

    public static Random rnd = new Random();
    public static ArrayList<Integer> al = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]\n");
        int n = 0;
        String[][] arr;
        Scanner sc = new Scanner(System.in);
        String[] result = new String[6];
        int[] count;

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        n = Integer.parseInt(sc.nextLine());
        arr = new String[n][6];
        count = new int[n];
        for(int i = 0; i < 6; i++){
            shuffle(arr[i]);
            System.out.print(String.format("%c\t%s", i + 65, String.join(",", arr[i])));
        }
        shuffle(result);
        System.out.printf("\n[로또 발표]\n \t%s\n\n", String.join(",", result));

        check(arr, result, count);

        System.out.println("[내 로또 결과]");
        for (int i = 0; i < n; i++){
            System.out.printf("%c\t%s => %d개 일치\n", i+65, String.join(",", arr[i]), count[i]);
        }
    }
    public static void shuffle(String[] arr){
        int j;
        for (int i = 0; i < 6; i++){
            j = rnd.nextInt(45) + 1;
            if(al.contains(j)) i--;
            else al.add(j);
        }
        al.sort(Comparator.naturalOrder());

        for (int i = 0; i < 6; i++){
            arr[i] = Integer.toString(al.get(i));
        }
        al.clear();
    }
    public static void check(String[][] data, String[] target, int[] count){
        al = (ArrayList)Arrays.asList(target);
        for (int i = 0; i < data.length; i++){
            for(String s : data[i]){
                if(al.contains(s)) count[i]++;
            }
        }
    }
}
