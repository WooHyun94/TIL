public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1;
        System.out.println(b); // convert int to double

        //int c = 1.1; // cannnot convert double to int
        double d = 1.1;
        int e = (int)1.1; // 명시적 형변환
        System.out.println(d);
        System.out.println(e); // 손실 발생

        int f = (int) 4.6;
        System.out.println(f); // 버림

        String g = Integer.toString(1);
        System.out.println(g);
        System.out.println(g.getClass());
    }
}
