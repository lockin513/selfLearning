import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class collectionSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        // 遍历方式一：增强for
        for(String s : set){
            System.out.println(s);
        }
        // 遍历方式二：迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        // 遍历方式三：lambda
        set.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });
    }
}
