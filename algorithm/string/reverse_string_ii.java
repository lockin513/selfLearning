public class reverse_string_ii {
    public String reverseStr(String s, int k) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int left = 0;
        while(len-left>=k)
        {
            int l = left;
            int r = left+k-1;
            reverse(arr,l,r);
            left+=2*k;
        }
        int l = left;
        int r = len-1;
        reverse(arr,l,r);
        return new String(arr);
    }

    public void reverse(char[] arr, int l, int r)
    {
        while(l<r)
        {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
    }
}
