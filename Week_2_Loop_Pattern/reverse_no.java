import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        if (n == 0) {
            System.out.println(0);
        } else {
            while (n != 0) {
                System.out.print(n % 10);
                n /= 10;
            }
        }
    }
}