//package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class NumberSpiral {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static long t = in.nextLong();

    public static void main(String[] args) throws IOException {
        while(t-- > 0){
            solve();
        }

    }
    public static void solve(){
            long ans=1;
            long x = in.nextLong(), y = in.nextLong();
            if(x>y){
                if(x%2==0){
                    ans=(x*x)-y+1;
                }else{
                    ans=(x-1)*(x-1)+y;
                }
            }else{
                if(y%2==0){
                    ans=(y-1)*(y-1)+x;
                }else{
                    ans=(y*y)-x+1;
                }
            }
        System.out.println(ans);
    }

    static class FastReader {
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
