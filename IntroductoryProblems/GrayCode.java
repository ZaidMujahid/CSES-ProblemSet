//package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class GrayCode {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static int n = in.nextInt();
    public static Deque<StringBuilder> dq = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        dq.add(new StringBuilder("0"));
        dq.add(new StringBuilder("1"));
        for (int i = 2; i <= n; i++) {
            List<StringBuilder> li = new ArrayList<>((int) Math.pow(2, i - 1));
            for (int j = 0; j < (int) Math.pow(2, i - 1); j++) {
                StringBuilder curr = dq.pollLast();
                li.add(new StringBuilder(curr).append("1"));
                dq.addFirst(curr.append("0"));
            }
            li.forEach(o -> dq.addLast(o));
        }
        dq.forEach(o -> System.out.println(o.reverse()));
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
