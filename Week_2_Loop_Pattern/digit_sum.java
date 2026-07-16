import java.util.Scanner;

public class digit_sum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long sum = 0;

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        
        System.out.print(sum);
    }
}