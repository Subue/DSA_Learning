import java.util.Scanner;

public class printNo_in_Rang{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for(int i=a; i<=b; i++){
            System.out.print(i+" ");
        }
    }
}