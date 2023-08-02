import java.util.Scanner;

public class Week1Quiz2 {
    /*
    * 우현
    * 결제 금액 캐시백 계산 프로그램
    * */
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");

        Scanner sc = new Scanner(System.in);
        int inputNum = Integer.parseInt(sc.nextLine());
        int cashBack = (int)(inputNum * 0.1);

        if (cashBack >= 300){
            cashBack = 300;
        }else{
            cashBack = (cashBack / 100) * 100;
        }
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", inputNum, cashBack);
    }
}
