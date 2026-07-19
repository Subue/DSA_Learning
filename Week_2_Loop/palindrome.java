import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long m = n;
        long sum = 0;

        while (n != 0) {
            sum = (sum*10)+(n % 10);
            n /= 10;
        }
        
        if(m == sum){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
            
        
        
    }
}