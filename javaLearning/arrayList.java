import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        System.out.println(list);
        list.remove("AAA");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.set(0,"EEE");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
