package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class IncreasingArray {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static int n = in.nextInt();
    public static long[] arr = new long[n];

    public static void main(String[] args) throws IOException {
        long ans=0;
        for(int i=0;i<arr.length;i++)
            arr[i] = in.nextLong();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                ans+= (arr[i]-arr[i+1]);
                arr[i+1]=(arr[i]-arr[i+1])+arr[i+1];
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
