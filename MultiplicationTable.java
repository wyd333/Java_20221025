import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2d* %-2d",i,j);
            }
            System.out.println("");
        }
        reader.close();
    }
}
