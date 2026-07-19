import java.util.Scanner;

public class print_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        // for (int i = 1; i <= N; i++) {
        //     System.out.println(i);
        // }

        // for (int i = N; i >= 1; i--) {
        //     System.out.println(i);
        // }

        int i = 1;
        while(i <= N){
            System.out.println(i);
            i++;
        }
    }
}

// javac print_number.java
// java print_number