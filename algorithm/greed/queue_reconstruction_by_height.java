import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class queue_reconstruction_by_height {
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            // 身高从大到小排（身高相同k小的站前面）
            Arrays.sort(people, (a, b) -> {
                // a - b 是升序排列，故在a[0] == b[0]的狀況下，會根據k值升序排列
                if (a[0] == b[0]) return a[1] - b[1];
                return b[0] - a[0];   //b - a 是降序排列，在a[0] != b[0]，的狀況會根據h值降序排列
            });
            List<int[]> ans = new LinkedList<>();
            for(int[] p:people)ans.add(p[1],p);
            return ans.toArray(new int[people.length][]);
        }
    }
}
