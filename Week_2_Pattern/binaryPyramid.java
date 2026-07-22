import java.util.Scanner;

public class binaryPyramid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            int start;
            if(i % 2 == 1){
                start = 0;
            } else {
                start = 1;
            }
            
            for(int j = 1; j <= i; j++){
                // 1. Print the current value first
                System.out.print(start);
                
                // 2. Flip the value for the next iteration
                if(start == 0){
                    start = 1;
                } else {
                    start = 0;
                }
            }
            System.out.println();
        }
    }
}