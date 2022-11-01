import java.util.Scanner;

public class PrimeJudge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(reader.hasNextInt()) {
            int num = reader.nextInt();
            int flag = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("����������");
            } else {
                System.out.println("��������");
            }
        }

        reader.close();
    }
}
