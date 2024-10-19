import java.util.Scanner;

public class metuanTest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) num[i] = in.nextInt();
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int hasOdd = 0;
            int sum = 0;
            while(num[i]!=0)
            {
                int res = num[i]%10;
                if(res%2!=0)hasOdd=1;
                sum+=res;
                num[i] /= 10;
            }
            if(sum%2==0 && hasOdd==1)ans++;
        }
        System.out.println(ans);
    }
}
