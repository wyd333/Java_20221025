import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        int r = 0;
        r = num1 % num2;
        while(r != 0) {
            num1 = num2;
            num2 = r;
            r = num1 % num2;
        }
        System.out.println("���Լ���ǣ�"+ num2);
        reader.close();
    }
}
