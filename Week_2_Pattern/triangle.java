import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        scanner.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            // Append leading spaces: (n - i) spaces
            for (int j = 0; j < n - i; j++) {
                sb.append(" ");
            }
            
            // Append stars separated by a space
            for (int j = 0; j < i; j++) {
                sb.append("*");
                // Only add a space if it's not the last star in the row
                if (j < i - 1) {
                    sb.append(" ");
                }
            }
            
            // Move to the next line
            sb.append("\n");
        }

        // Print the completely built string at once for maximum performance
        System.out.print(sb.toString());
    }
}