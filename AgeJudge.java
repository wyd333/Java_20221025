import java.util.Scanner;

public class AgeJudge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNextInt()) {
            int age = reader.nextInt();
            if(age <= 18) {
                System.out.println("����");
            } else if(age >= 19 && age <=28) {
                System.out.println("����");
            } else if(age >= 29 && age <= 55) {
                System.out.println("����");
            } else if(age >= 56) {
                System.out.println("����");
            }
        }
        reader.close();
    }
}
