import java.util.Scanner;

public class hcf {
   
public class Main {

    public static int hcf(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(hcf(a, b));
    }
}
}
