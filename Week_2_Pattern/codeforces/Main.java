import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}