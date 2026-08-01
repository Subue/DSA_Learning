import java.util.Scanner;

public class ArrSort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        boolean flag = false;
        
        for (int i = 1; i < n; i++) {
            if(arr[i] >= arr[i-1]){
                
            }  
            else{
                flag = true;
                break;
            }  
        }
        if(flag){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
