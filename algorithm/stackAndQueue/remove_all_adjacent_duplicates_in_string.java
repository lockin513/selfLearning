public class remove_all_adjacent_duplicates_in_string {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int p = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(p==-1 || arr[p]!=arr[i])
                arr[++p]=arr[i];
            else p--;
        }
        return String.valueOf(arr,0,p+1);
    }
}
