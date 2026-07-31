import java.util.Scanner;

public class maxEle_position{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        int ans = arr[0];
        int location = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] > ans){
                ans = arr[i];
                location = i + 1;
            }
        }
        System.out.println(ans +" "+ location);
    }
}