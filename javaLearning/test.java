import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        List<List<Integer>> sortedList = groupSort(list);
        for (List<Integer> subList : sortedList) {
            System.out.println(subList);
        }
    }

    public static List<List<Integer>> groupSort(List<Integer> arr) {
        int[] rem = new int[100010];
        for (int i = 0; i < arr.size(); i++) {
            rem[arr.get(i)]++; // 统计频率
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < rem.length; i++) {
            if (rem[i] != 0) {
                List<Integer> con = new ArrayList<>();
                con.add(i);
                con.add(rem[i]);
                ans.add(con);
            }
        }

        Collections.sort(ans, (a, b) -> {
            if (a.get(1) != b.get(1)) {
                return b.get(1) - a.get(1); // 频率降序
            } else {
                return a.get(0) - b.get(0); // 值升序
            }
        });

        return ans;
    }
}