import java.util.Scanner;

public class AgeJudge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()) {
            int age = reader.nextInt();
            if(age <= 18) {
                System.out.println("少年");
            } else if(age >= 19 && age <=28) {
                System.out.println("青年");
            } else if(age >= 29 && age <= 55) {
                System.out.println("中年");
            } else if(age >= 56) {
                System.out.println("老年");
            }
        }
        reader.close();
    }
}
