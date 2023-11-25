//package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class CreatingStrings {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static String s = in.nextLine();
    public static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        solve(s, 0, s.length()-1);
        System.out.println(set.size());
        List<String> li = new ArrayList<>(set);
        Collections.sort(li);
        for(String s : li) System.out.println(s);

    }
    public static void solve(String s, int l, int r){
        if (l == r)
            set.add(s);
        else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                solve(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }
    public static String swap(String s, int i, int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
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
