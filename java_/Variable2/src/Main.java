// Java 프로그래밍 - 변수와 자료형_2

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//      1-1. 정수
        int intNum = 10;
        System.out.println(intNum);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int intNUm2 = Integer.MAX_VALUE;
        int intNUm3 = Integer.MAX_VALUE + 1;
        System.out.println(intNUm2);
        System.out.println(intNUm3);

        long longNum = (long) Integer.MAX_VALUE + 1;
        System.out.println(longNum);

//      1-2. 실수
        float floatNum = 1.23f;
        System.out.println(floatNum);
        double doubleNum = 1.23;
        System.out.println(doubleNum);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

//      1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        int numBase8 = 014;
        int numBase16 = 0xC;

        System.out.println(numBase2);
        System.out.println(numBase8);
        System.out.println(numBase16);

        System.out.println(Integer.toBinaryString(numBase2));
        System.out.println(Integer.toOctalString(numBase8));
        System.out.println(Integer.toHexString(numBase16));

//      2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isPass = true;
        boolean isOK = false;

        System.out.println(isPass);
        System.out.println(isOK);

//      3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        char keyLast = 'z';
        System.out.println(keyFirst);
        System.out.println(keyLast);

        System.out.println((int)keyFirst);
        System.out.println((int)keyLast);
    }
}
