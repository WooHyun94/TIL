import java.time.LocalDate;
import java.util.Scanner;

public class Week1Quiz5 {
    /*
    우현
    달력 출력 프로그램
    * */
    public static void main(String[] args) {
        System.out.println("[달력 출력 프로그램]");
        int year, month;
        Scanner sc = new Scanner(System.in);
        LocalDate ld;
        int start = 1;
        int firstDate, lastDate;

        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        year = Integer.parseInt(sc.nextLine());
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        month = Integer.parseInt(sc.nextLine());

        ld = LocalDate.of(year, month, start);
        firstDate = ld.getDayOfWeek().getValue();
        lastDate = ld.lengthOfMonth();

        System.out.println("\n");
        System.out.println(String.format("[%d년 %02d월]", year, month));
        System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
        for (int i = 0; i < firstDate % 7; i++){
            System.out.printf("\t");
        }

        Loop:
        while(true){
            for (int i = 0; i < 7; i++){
                System.out.printf("%02d  ", start++);
                firstDate++;
                if(firstDate == 7) {
                    firstDate = 0;
                    System.out.println();
                    break;
                }
                if (start > lastDate) break Loop;
            }
        }
    }
}
