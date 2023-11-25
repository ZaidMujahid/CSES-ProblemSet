package IntroductoryProblems;
import java.util.*;
import java.io.*;

public class Permutations {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static FastReader in = new FastReader();
    public static int n = in.nextInt();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
//        TLE
//        int temp=n;
//        li = new ArrayList<>(n);
//        if(n==1){
//            System.out.println(1);
//            return;
//        }
//        if(n<4){
//            System.out.println("NO SOLUTION");
//            return;
//        }
//        li.add(0,n-1);
//        n=n-1;
//        while(n>0){
//            if(n-2>0) li.add(n-2);
//            n=n-2;
//        }
//        if(n<=0) li.add(temp);
//        int ind = li.indexOf(temp) - 1;
//        int i=li.indexOf(temp)+1;
//        if(temp%2!=0){
//            li.add(i, li.get(ind)-1);
//            n=li.get(ind)-1;
//            i++;
//            while(i<temp){
//                li.add(i, n+2);
//                n=n+2;
//                i++;
//            }
//        }
//        else{
//            li.add(i, li.get(1)+1);
//            n=li.get(1)+1;
//            i++;
//            while(i<temp){
//                li.add(i, n-2);
//                n=n-2;
//                i++;
//            }
//        }
//
//        for (Integer k : li) System.out.print(k + " ");

        //Accepted one
        if(n==1){
            System.out.println(1);
            return;
        }
        else if(n==2 || n==3){
            System.out.println("NO SOLUTION");
            return;
        }
        else {
            for (int i = 2; i <= n; i += 2) {
                sb.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
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
