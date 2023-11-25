package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class AppleDivision {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static int n = in.nextInt();

    public static void main(String[] args) throws IOException {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        long best = Integer.MAX_VALUE, a, b;

        for (int i = 0; i < (1 << n); i++) {
            a = 0;
            b = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) == 1) a += arr[j];
                else b += arr[j];

                best = Math.min(best, Math.abs(a - b));
            }
        }
        System.out.println(best);
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
