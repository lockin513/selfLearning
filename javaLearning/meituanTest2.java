import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class meituanTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
        {
            long temp = 0;
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i)<='9')
                {
                    temp*=10;
                    temp+=s.charAt(i)-'0';
                    i++;
                }
                list.add(temp);
                i--;
            }
        }
        if(list.size()<k) System.out.println("N");
        else
        {
            Collections.sort(list,Collections.reverseOrder());
            for(int i=0;i<list.size();i++) System.out.print(list.get(i)+" ");
            System.out.println();
            System.out.println(list.get(k-1));
        }
    }
}
