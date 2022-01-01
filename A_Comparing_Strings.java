import java.util.*;

public class A_Comparing_Strings {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("NO");
            return;
        } else {
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    count++;
                    arr.add(i);
                }
            }
            if (count == 2) {
                int val1 = arr.get(0);
                int val2 = arr.get(1);
                char[] ch = str1.toCharArray();

                char temp = ch[val1];
                ch[val1] = ch[val2];
                ch[val2] = temp;
                String ans = new String(ch);
                if (ans.equals(str2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("NO");
            }

        }

    }
}