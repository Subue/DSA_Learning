import java.util.Scanner;

public class binomial_factorial {

    public static long factorial(int n) {
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        // n!
        long nFact = factorial(n);

        // r!
        long rFact = factorial(r);

        // (n-r)!
        long nrFact = factorial(n - r);

        System.out.println(nFact / (rFact * nrFact));
    }
}