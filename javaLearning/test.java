import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> con1 = new ArrayList<>();
        List<Integer> con2 = new ArrayList<>();

        con1.add(1);
        con1.add(2);
        con1.add(3);

        con2.add(4);
        con2.add(5);
        con2.add(6);

        ans.add(con1);
        ans.add(con2);
        System.out.println(ans);
    }
}
