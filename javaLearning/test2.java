import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int[] guess = new int[n];
        for (int i = 0; i < n; i++) guess[i] = in.nextInt();
        int min = 0,max = Integer.MAX_VALUE;
        int flag = 1;
        for (int i = 0; i < n-1; i++)
        {
            if(guess[i]<min || guess[i]>max)
            {
                flag = 0;
                break;
            }
            if(guess[i]>guess[i+1])
            {
                max = guess[i];
            }
            else
            {
                min = guess[i];
            }
        }
        if(guess[guess.length-1]<min || guess[guess.length-1]>max || flag==0) System.out.println("0");
        else System.out.println(max-min);
    }
}
