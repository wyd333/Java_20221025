import java.util.Scanner;

public class BitCount {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        int num = reader.nextInt();
        while(num != 0) {
            if((num & 1) == 1) {
                count++;
            }
            num >>>= 1;
        }
        System.out.println(count);

        reader.close();
    }
}
