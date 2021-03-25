import java.io.*;
import java.util.*;

class amazeXOR {
    private static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int t = sc.nextInt();
		while (t-- > 0) {
            int num = sc.nextInt();	
            problem(num);
        }

        
    }
    public static void problem(int num){
        String str = Integer.toBinaryString(num);
      String a = new String();
      String b = new String();
    //    System.out.println(str);

        if(str.charAt(0) =='1'){
            a+=1;
            b+=0;
        }
        else{
            a+=0;
            b+=1;
        }

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) =='1'){
                a+=0;
                b+=1;
            }
            else{
                a+=1;
                b+=1;
            }
        }
        // System.out.println(a);
        // System.out.println(b+"viaks");
         long res =  converter(a,b);
           System.out.println(res);  
    }

    public static long converter(String a,String b){
        long val1 =0;
        long val2 =0;
              val1=     Integer.parseInt(a, 2);
            val2 = Integer.parseInt(b, 2);
            return val1*val2;
    }


    }
