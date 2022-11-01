import java.util.Scanner;

public class PrimePrint {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        for (int num = 1; num < 100; num++) {
            int flag = 0;
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0 && num != 1) {
                count++;
                System.out.println(num+"");
            }
        }
        System.out.println("¹²"+count+"¸ö");
    }
}
