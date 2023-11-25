package IntroductoryProblems;

import java.util.*;
import java.io.*;

public class PalindromeReorder {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static String s = in.nextLine();
    public static int[] count = new int[26];
    public static Deque<Character> dq = new ArrayDeque<>();
    public static Queue<Integer> q = new LinkedList<>();
    public static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) throws IOException {
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-65]++;
        }
        int odd=0;
        for (int j : count) {
            if (j % 2 != 0) odd++;
        }
        if(odd>1){
            System.out.println("NO SOLUTION");
            return;
        }
        solve();
    }
    public static void solve(){
        for(int i=0;i<26;i++){
            if(count[i]%2==1){
                for(int j=0;j<count[i];j++) dq.addFirst((char) (65+i));
            }else{
                for(int j=0;j<count[i]/2;j++){
                    dq.addLast((char)(65+i));
                    if(j==0) q.add(i);
                }
            }
        }
        Iterator itr = q.iterator();
        while (itr.hasNext()){
            int a = (int) itr.next();
            for(int j=0;j<count[a]/2;j++){
                dq.addFirst((char)(65+a));
            }
        }

        dq.forEach((n) -> ans.append(n));
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
