import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // 1、添加一个元素
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        // 2、直接打印list
        System.out.println(list); // [AAA, BBB, CCC]
        // 3、删除具体一个元素
        list.remove("AAA");
        System.out.println(list); // [BBB, CCC]
        // 4、获取list的大小
        list.size(); // 2
        // 5、获取指定位置的元素
        list.get(1); // CCC
        // 6、修改指定位置的元素为
        list.set(0,"EEE");
        System.out.println(list); // [EEE, CCC]
        // 7、删除指定位置的元素
        list.remove(0);
        System.out.println(list); // [CCC]
        list.add("AAA");
        list.add("BBB");
        System.out.println("-----");
        // 遍历方式一：普通for
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // 遍历方式二：增强for
        for(String s:list){
            System.out.println(s);
        }
        // 遍历方式三：迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        // 遍历方式四：lambda表达式
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
