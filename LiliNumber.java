public class LiliNumber {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            int tmp = num;
            int ret = 0;
            int digit = 0;
            while(tmp != 0) {
                digit = tmp % 10;
                ret += Math.pow(digit,3);
                tmp /= 10;
            }
            if(num == ret) {
                System.out.println(num);
            }
        }
    }
}
