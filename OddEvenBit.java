import java.util.Scanner;

public class OddEvenBit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        //��ӡ����λ
        System.out.println("����λ��");
        for(int i = 30; i >= 0; i -= 2){
            System.out.print((n >> i) & 1);
        }

        System.out.println();

        //��ӡż��λ
        System.out.println("ż��λ��");
        for(int i = 31; i >= 1; i -= 2){
            System.out.print((n >> i) & 1);
        }
        reader.close();
    }
}

