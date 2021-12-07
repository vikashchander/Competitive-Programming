/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class A_Amusing_Joke {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
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

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        FastReader scn = new FastReader();
        String str1 = scn.next();
        String str2 = scn.next();
        String str3 = scn.next();
        int len = str1.length()+str2.length();
        int count =0;
        if(str3.length() > len){
            System.out.println("NO");
        }else{
             HashMap<Character,Integer> hm = new HashMap<>();

             for(int i=0; i<str3.length(); i++){
                 hm.put(str3.charAt(i),hm.getOrDefault(str3.charAt(i),0)+1);
             }

           for(char ch: str1.toCharArray()){
                 if(hm.containsKey(ch)){
                     count++;
                     hm.put(ch,hm.get(ch)-1);
                     if(hm.get(ch)<=0){
                         hm.remove(ch);
                     }
                 }
           }

           for(char ch: str2.toCharArray()){
            if(hm.containsKey(ch)){
                count++;
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)<=0){
                    hm.remove(ch);
                }
            }
         }
        if(count ==len)
        System.out.println("YES");
        else 
        System.out.println("NO");
    }

}
}