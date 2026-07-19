import java.util.Scanner;

public class even{
    public static void main(String[] args){
        Scanner in = new  Scanner(System.in);

        int N = in.nextInt();

        for(int i=1; i <= N; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}