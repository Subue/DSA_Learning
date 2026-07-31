import java.util.Scanner;

public class SearchInArray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int target = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        boolean flag = false;
        int position = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                flag = true;
                position = i+1; 
            }
        }

        if(flag){
            System.out.println("YES");
            System.out.println("Target Element: " + target);
            System.out.println("Position: " + position);
            
            
        }
        else{
            System.out.println("NO");
        }
            

    }
}