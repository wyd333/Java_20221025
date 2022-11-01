import java.util.Scanner;

public class OddEvenBit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        //打印奇数位
        System.out.println("奇数位：");
        for(int i = 30; i >= 0; i -= 2){
            System.out.print((n >> i) & 1);
        }

        System.out.println();

        //打印偶数位
        System.out.println("偶数位：");
        for(int i = 31; i >= 1; i -= 2){
            System.out.print((n >> i) & 1);
        }
        reader.close();
    }
}

