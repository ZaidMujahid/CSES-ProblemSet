package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class CoinPiles {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static int t = in.nextInt();
    public static Deque<StringBuilder> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        while(t-- > 0) solve();

    }
    public static void solve(){
        long x = in.nextLong(), y = in.nextLong();
        long larger=Math.max(x,y), smaller=Math.min(x,y);
        if(larger>smaller*2) System.out.println("NO");
        else{
            larger%=3;
            smaller%=3;
            if(smaller==0&&larger==0 || smaller==1&&larger==2 || smaller==2&&larger==1) System.out.println("YES");
            else System.out.println("NO");
        }
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
