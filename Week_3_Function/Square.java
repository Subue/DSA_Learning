
public class Square {
    public static void SquareSh(int n, char ch){
        for (int i = 1; i <= n; i++ ){
            for(int j = 1; j <= n; j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
       
        SquareSh(5,'a');

    }
}
