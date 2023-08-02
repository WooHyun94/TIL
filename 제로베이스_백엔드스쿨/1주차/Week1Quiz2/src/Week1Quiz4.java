import java.util.Random;
import java.util.Scanner;

public class Week1Quiz4 {
    /*
    우현
    주민등록번호 생성 프로그램
    * */
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산");
        int year, month, date;
        String gender;
        Scanner sc = new Scanner(System.in);
        String result;
        Random rnd = new Random();

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        year = Integer.parseInt(sc.nextLine().substring(2, 4));
        System.out.print("출생월을 입력해 주세요.(mm):");
        month = Integer.parseInt(sc.nextLine());
        System.out.print("출생일을 입력해 주세요.(dd):");
        date = Integer.parseInt(sc.nextLine());
        System.out.print("성별을 입력해 주세요.(m/f):");
        gender = sc.nextLine();

        result = String.format("%d%02d%02d-", year, month, date);

        if(gender.equals("m")){
            result += "3";
        }else{
            result += "4";
        }

        result += Integer.toString(rnd.nextInt(999999) + 1);

        System.out.println(result);
    }
}
