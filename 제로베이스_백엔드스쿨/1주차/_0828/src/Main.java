import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean re = false;

        for(int i = 0; i < input.length() - 1; i++){
            String check = input + new StringBuffer(input.substring(0, i)).reverse().toString();

            if(check.equals(new StringBuffer(check).reverse().toString())){
                System.out.println(check.length());
                re = true;
                break;
            }
        }
        if(!re){
            System.out.println(2 * input.length() - 1);
        }
    }
}