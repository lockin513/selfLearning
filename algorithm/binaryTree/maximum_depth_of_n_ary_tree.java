import java.util.List;

public class maximum_depth_of_n_ary_tree {
    class Solution {
        public int maxDepth(Node root) {
            if(root==null)return 0;
            else
            {
                int max = 0;
                for(Node node:root.children)
                {
                    int temp = maxDepth(node);
                    if(temp>max)max=temp;
                }
                return max+1;
            }
        }
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
