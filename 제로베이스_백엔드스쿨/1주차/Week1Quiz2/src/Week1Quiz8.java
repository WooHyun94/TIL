import java.util.Scanner;

public class Week1Quiz8 {
    /*
    * 우현
    * 연소득 과세금액 계산 프로그램
    * */
    public static int[] tariff = {6, 15, 24, 35, 38, 40, 42, 45};
    public static long[] base = {12_000_000L, 46_000_000L, 88_000_000L, 150_000_000L, 300_000_000L, 500_000_000L, 1_000_000_000L};
    public static long[] deduction = {1_080_000L, 5_220_000L, 14_900_000L, 19_400_000L, 25_400_000L, 35_400_000L, 65_400_000L};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = 0;
        long n;

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        n = Long.parseLong(sc.nextLine());

        for (int i = 0; i < base.length; i++) {
            if(base[i] < n) grade++;
            else break;
        }

        printTax(n, grade);
        System.out.println(String.format("[세율에 의한 세금]:%20d", calTariff(n, grade)));
        System.out.println(String.format("[누진공제 계산에 의한 세금]:%13d", calTariff(n, grade)));
    }

    public static void printTax(long n, int grade){
        long cal = 0;
        for (int i = 0; i <= grade; i++){

            if (i != grade){
                cal = i == 0 ? base[i] : base[i] - base[i - 1];
                System.out.printf("%10d * %2d%% = %10d\n", cal, tariff[i], (int)(cal * ((float)tariff[i] / 100)));
            }else{
                n -= base[i - 1];
                System.out.printf("%10d * %2d%% = %10d\n", n, tariff[i], (int)(n * ((float)tariff[i] / 100)));
            }
        }
        System.out.println();
    }
    public static long calTariff(long n, int grade){
        long cal = 0, answer = 0;

        for (int i = 0; i <= grade; i++){

            if (i != grade){
                cal = i == 0 ? base[i] : base[i] - base[i - 1];
                answer += (long)(cal * ((float)tariff[i] / 100));
            }else{
                n -= base[i - 1];
                answer += (long)(n * ((float)tariff[i] / 100));
            }
        }
        return answer;
    }
    public static long calDeduction(long n, int grade){
        long answer = 0;

        answer = (long)(n * ((float)tariff[grade] / 100) - deduction[grade]);

        return answer;
    }
}
