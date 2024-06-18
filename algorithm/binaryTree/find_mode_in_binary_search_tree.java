import java.util.ArrayList;

public class find_mode_in_binary_search_tree {
    ArrayList<Integer> ans = new ArrayList<>();
    int count = 0;
    int maxCount = 1;
    int pre = -999999;
    public int[] findMode(TreeNode root) {
        find(root);
        int[] a = new int[ans.size()];
        for(int i=0;i<ans.size();i++)a[i]=ans.get(i);
        return a;
    }
    public void find(TreeNode root){
        if(root==null)return;
        find(root.left);
        if(pre==-999999 || root.val==pre){
            count++;
            if(count==maxCount)ans.add(root.val);
            if(count>maxCount)
            {
                ans.clear();
                maxCount = count;
                ans.add(root.val);
            }
        }else {
            count=1;
            if(count==maxCount)ans.add(root.val);
        }
        pre = root.val;
        find(root.right);
    }
}
