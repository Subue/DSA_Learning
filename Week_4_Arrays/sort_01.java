import java.util.Scanner;

public class sort_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];    
        

            int c0 = 0;
            int c1 = 0;

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();

                if(arr[j] == 0){
                    c0++;
                }
                else{
                    c1++;
                }
            }

            for (int j = 0; j < c0; j++) {
                System.out.print("0 ");
            }

            for (int j = 0; j < c1; j++) {
                System.out.print("1 ");
              
            }
            System.out.println();
        }


    }
    
}
