import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();

        int toGuess = random.nextInt(100);

        while(true) {
            int num = reader.nextInt();
            if(num > toGuess) {
                System.out.println("�´��ˣ�");
            } else if(num < toGuess) {
                System.out.println("��С�ˣ�");
            } else {
                System.out.println("�¶��ˣ�");
                break;
            }
        }

        reader.close();
    }
}
