import java.util.Scanner;

public class primeInRange {

    public static boolean isPrime(int n){
        
         int cnt = 0;

        for (int i =1; i <= n; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        return (cnt == 2);
    }
   
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i =1; i <=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}

