import java.util.Scanner;
 
public class countNumber{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int positive = 0;
        int negetive = 0;
        int even = 0;
        int odd = 0;

        for(int i = 1; i <= n; i++){
            int x = in.nextInt();

            if(x > 0){
                positive++;
            }
            else{
                negetive++;
            }

            if(x % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(positive);
        System.out.println(negetive);
        System.out.println(even);
        System.out.println(odd);
    }
}
        
      