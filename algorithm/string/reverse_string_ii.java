public class reverse_string_ii {
    class Solution {
        public String reverseStr(String s, int k) {
            char[] str = s.toCharArray();
            int left = 0,len=s.length();
            while(len-left>k)
            {
                reverse(str,left,left+k-1);
                left+=2*k;
            }
            reverse(str,left,len-1);
            return new String(str);
        }
        public void reverse(char[] arr, int l, int r)
        {
            while(l<r)
            {
                char temp = arr[l];
                arr[l++] = arr[r];
                arr[r--]= temp;
            }
        }
    }
}
