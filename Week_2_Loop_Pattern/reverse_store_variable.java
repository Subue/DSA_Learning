import java.util.Scanner;

public class reverse_store_variable{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long sum = 0;

        while (n != 0) {
            sum = (sum*10)+(n % 10);
            n /= 10;
        }
        
        System.out.print(sum);
    }
}