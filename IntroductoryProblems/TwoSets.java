package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class TwoSets {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static int n = in.nextInt();

    public static void main(String[] args) throws IOException {
        int sum = n*(n+1)/2;
        if(sum%2!=0){
            System.out.println("NO");
        }else{
            HashSet<Integer> s1 = new HashSet<>();
            HashSet<Integer> s2 = new HashSet<>();
            int i;
            int j=n;
            if(n%2==0) i=1;
            else{
                s1.add(1);
                s1.add(2);
                s2.add(3);
                i=4;
            }
            while (i<=j){
                s1.add(i);++i;
                s2.add(i);++i;
                s1.add(j);--j;
                s2.add(j);--j;
            }
            System.out.println("YES");
            System.out.println(s1.size());
            StringBuilder sb = new StringBuilder();
            for(int s : s1) sb.append(s).append(" ");
            System.out.println(sb);
            System.out.println(s2.size());
            sb.delete(0,sb.length());
            for(int s : s2) sb.append(s).append(" ");
            System.out.println(sb);
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
