import java.util.ArrayList;
import java.util.List;

public class binary_tree_paths {
    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        findAns(root,path);
        return ans;
    }
    public void findAns(TreeNode root, List<Integer> path){
        path.add(root.val);
        if(root.left==null && root.right==null) ans.add(getString(path));
        if(root.left!=null)
        {
            findAns(root.left,path);
            path.remove(path.size()-1);
        }
        if(root.right!=null)
        {
            findAns(root.right,path);
            path.remove(path.size()-1);
        }
    }
    public String getString(List<Integer> path){
        StringBuilder sb = new StringBuilder();
        for(int i=0;;i++)
        {
            if(i==path.size()-1)
            {
                sb.append(path.get(i));
                break;
            }
            sb.append(path.get(i)+"->");
        }
        return sb.toString();
    }
}
