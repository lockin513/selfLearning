import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        list.add(1);
        list2.add(list);
        for (List<Integer> integers : list2) {
            System.out.println(integers);
        }
        list.add(2);
        for (List<Integer> integers : list2) {
            System.out.println(integers);
        }
    }
}
