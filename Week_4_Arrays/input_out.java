import java.util.Scanner;

public class input_out {
    public static void main(String[] srgs){

        Scanner sc = new Scanner(System.in);

        int[] roll1 = new int[5];

        
        for (int i=0; i < roll1.length; i++){
            roll1[i] = sc.nextInt();
             
        }

        for (int i=0; i < roll1.length; i++){
            System.out.print(roll1[i]+" ");
             
        }

        
    }
    
}
