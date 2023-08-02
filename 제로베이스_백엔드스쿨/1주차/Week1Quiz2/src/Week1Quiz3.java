import java.util.Scanner;

public class Week1Quiz3 {
    /*
    우현
    놀이동산 입장권 계산 프로그램
    * */
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");
        int age, time, fee;
        String merit, welfare;
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요.(숫자):");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("입장시간를 입력해 주세요.(숫자입력):");
        time = Integer.parseInt(sc.nextLine());
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        merit = sc.nextLine();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        welfare = sc.nextLine();

        if(age < 3){
            fee = 0;
        }else if (age < 13 || time >= 17){
            fee = 4000;
        }else if (welfare.equals("y") || merit.equals("y")){
            fee = 8000;
        }else{
            fee = 10000;
        }

        System.out.println(String.format("입장료: %d", fee));
    }
}
