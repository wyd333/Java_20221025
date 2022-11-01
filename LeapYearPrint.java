public class LeapYearPrint {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 1000; year <= 2000; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                count++;
                System.out.println(year);
            }
        }
        System.out.println("¹²"+count+"¸ö");
    }
}
