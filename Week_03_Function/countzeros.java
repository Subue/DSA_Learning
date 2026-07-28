import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class countzeros {

    public static void findno(long n){
        int cnt = 0;
        if (n == 0) {
            System.out.println(1);
            return;
        } 
        else {
            while (n != 0) {
                long k = n % 10;
                if(k == 0){
                    cnt++;
                }
                n /= 10;
            }
        }
        System.out.print(cnt);
    }
    

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();

        findno(x);
    }
    
}
