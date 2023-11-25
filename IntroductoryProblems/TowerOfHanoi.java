//package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class TowerOfHanoi {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static int n = in.nextInt();

    public static void main(String[] args) throws IOException {
        System.out.println((1<<n)-1);
        towerOfHanoi(n, 1, 3, 2);
    }
    static void towerOfHanoi(int n, int from_rod, int to_rod, int aux_rod) {
        if (n == 0) return;
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println(from_rod + " " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
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
