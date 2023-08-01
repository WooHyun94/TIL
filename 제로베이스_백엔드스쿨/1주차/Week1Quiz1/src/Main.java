public class Week1Quiz1 {
    public static void main(String[] args) {
        /*
        우현
        콘솔 화면에 구구단 출력하기
        * */

        System.out.println("[구구단 출력]");

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(String.format("%02d X %02d = %02d\t", j, i, j * i));
            }
            System.out.println();
        }
    }
}