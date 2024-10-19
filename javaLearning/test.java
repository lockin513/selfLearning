import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];
        for(int i = 0; i < n; i++) strs[i] = in.next();
        StringBuilder sb = new StringBuilder(strs[0]);
        System.out.println(strs[0]);
        for(int i = 1; i < n; i++)
        {
            int len = Math.min(sb.length(), strs[i].length());
//            System.out.println("i: "+i+"  sb:"+sb+"  str: "+strs[i]);
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < len; j++)
            {
                if(sb.charAt(j)==strs[i].charAt(j))
                {
                    temp.append(strs[i].charAt(j));
//                    System.out.println("temp:"+temp);
                    if(j==len-1)sb=temp;
                }
                else
                {
                    sb=temp;
//                    System.out.println("after compare:"+sb);
                    break;
                }
            }
            if(sb.length()==0) System.out.println("-1");
            else System.out.println(sb);
        }
    }
}
