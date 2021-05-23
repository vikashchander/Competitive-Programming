/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TicTac {
  
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
        Scanner scan = new Scanner(System.in);   
        int t = scan.nextInt();
        while (t-- > 0) {
           long cx=0,co=0,c_=0;
           char a[][]= new char[3][3];
          
           for(int i =0; i<3;i++){
               for(int j=0;j<3;j++){
                //    char val= scan.next().charAt(0);
                String str=scan.next();  
                   a[i][j] =str.charAt(0);   
                   if(a[i][j]=='X')cx++;
                if(a[i][j]=='O')co++;
                if(a[i][j]=='_')c_++;
               }
           }
           long wx = 0, wo = 0;
           if(a[0][0] == 'X' && a[1][0] == 'X' && a[2][0] == 'X')wx=1;
           if(a[0][1] == 'X' && a[1][1] == 'X' && a[2][1] == 'X')wx=1;
           if(a[0][2] == 'X' && a[1][2] == 'X' && a[2][2] == 'X')wx=1;
           if(a[0][0] == 'X' && a[1][1] == 'X' && a[2][2] == 'X')wx=1;
           if(a[0][0] == 'X' && a[0][1] == 'X' && a[0][2] == 'X')wx=1;
           if(a[1][0] == 'X' && a[1][1] == 'X' && a[1][2] == 'X')wx=1;
           if(a[2][0] == 'X' && a[2][1] == 'X' && a[2][2] == 'X')wx=1;
           if(a[0][2] == 'X' && a[1][1] == 'X' && a[2][0] == 'X')wx=1;
           
           if(a[0][0] == 'O' && a[1][0] == 'O' && a[2][0] == 'O')wo=1;
           if(a[0][1] == 'O' && a[1][1] == 'O' && a[2][1] == 'O')wo=1;
           if(a[0][2] == 'O' && a[1][2] == 'O' && a[2][2] == 'O')wo=1;
           if(a[0][0] == 'O' && a[1][1] == 'O' && a[2][2] == 'O')wo=1;
           if(a[0][0] == 'O' && a[0][1] == 'O' && a[0][2] == 'O')wo=1;
           if(a[1][0] == 'O' && a[1][1] == 'O' && a[1][2] == 'O')wo=1;
           if(a[2][0] == 'O' && a[2][1] == 'O' && a[2][2] == 'O')wo=1;
           if(a[0][2] == 'O' && a[1][1] == 'O' && a[2][0] == 'O')wo=1;
   
           if((wx == 1 && wo == 1) || ((cx-co)<0) || (cx-co)>1)System.out.println(3);
           else if(cx == 0 && co == 0 && c_ == 9)System.out.println(2);
           else if(wx == 1 && wo == 0 && cx > co)System.out.println(1);
           else if(wx == 0 && wo == 1 && cx == co)System.out.println(1);
           else if(wx == 0 && wo == 0 && c_ == 0)System.out.println(1);
           else if(wx == 0 && wo == 0 && c_ > 0)System.out.println(2);
           else System.out.println(3);

        }
    }

  
}





#include<bits/stdc++.h>
using namespace std;
#define ll long long int

int main()
{
    ll test;
    cin>>test;
    while(test--)
    {
        ll xcom = 0, ocom =0, com_= 0;
        char tictac[3][3];
        for(ll i=0;i<3;i++)
        {
            for(ll j=0;j<3;j++)
            {
                cin>>tictac[i][j];
                if(tictac[i][j]=='X')xcom++;
                if(tictac[i][j]=='O')ocom++;
                if(tictac[i][j]=='_')com_++;
            }
        }
        ll res_x = 0, res_0 = 0;
        if(tictac[0][0] == 'X' && tictac[1][0] == 'X' && tictac[2][0] == 'X' res_x=1;
        if(tictac[0][1] == 'X' && tictac[1][1] == 'X' && tictac[2][1] == 'X' res_x=1;
        if(tictac[0][2] == 'X' && tictac[1][2] == 'X' && tictac[2][2] == 'X' res_x=1;
        if(tictac[0][0] == 'X' && tictac[1][1] == 'X' && tictac[2][2] == 'X' res_x=1;
        if(tictac[0][0] == 'X' && tictac[0][1] == 'X' && tictac[0][2] == 'X' res_x=1;
        if(tictac[1][0] == 'X' && tictac[1][1] == 'X' && tictac[1][2] == 'X' res_x=1;
        if(tictac[2][0] == 'X' && tictac[2][1] == 'X' && tictac[2][2] == 'X' res_x=1;
        if(tictac[0][2] == 'X' && tictac[1][1] == 'X' && tictac[2][0] == 'X' res_x=1;
        
        if(tictac[0][0] == 'O' && tictac[1][0] == 'O' && tictac[2][0] == 'O')res_0=1;
        if(tictac[0][1] == 'O' && tictac[1][1] == 'O' && tictac[2][1] == 'O')res_0=1;
        if(tictac[0][2] == 'O' && tictac[1][2] == 'O' && tictac[2][2] == 'O')res_0=1;
        if(tictac[0][0] == 'O' && tictac[1][1] == 'O' && tictac[2][2] == 'O')res_0=1;
        if(tictac[0][0] == 'O' && tictac[0][1] == 'O' && tictac[0][2] == 'O')res_0=1;
        if(tictac[1][0] == 'O' && tictac[1][1] == 'O' && tictac[1][2] == 'O')res_0=1;
        if(tictac[2][0] == 'O' && tictac[2][1] == 'O' && tictac[2][2] == 'O')res_0=1;
        if(tictac[0][2] == 'O' && tictac[1][1] == 'O' && tictac[2][0] == 'O')res_0=1;

        if( res_x == 1 && res_0 == 1) || ((xcom-ocom)<0) || (xcom-ocom)>1)cout<<3<<"\n";
        else if(cx == 0 && ocom == 0 && com_ == 9)cout<<2<<"\n";
        else if (res_x == 1 && res_0 == 0 && cx > ocom)cout<<1<<"\n";
        else if (res_x == 0 && res_0 == 1 && cx == ocom)cout<<1<<"\n";
        else if (res_x == 0 && res_0 == 0 && com_ == 0)cout<<1<<"\n";
        else if (res_x == 0 && res_0 == 0 && com_ > 0)cout<<2<<"\n";
        else cout<<3<<"\n";
    }
    return 0;
}