package IntroductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(in.readLine());
        System.out.print(n+" ");
        while(n!=1){
            if(n%2==0) {
                n /= 2;
                System.out.print(n+" ");
            }
            else {
                n = (n * 3) + 1;
                System.out.print(n+" ");
            }
        }
    }
}