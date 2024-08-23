import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        // 1、添加元素
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        // 2、查找是否包含key
        map.containsKey("A");
        // 3、查找是否包含value
        map.containsValue("b");
        // 4、返回map的size
        map.size();
        // 5、删除一个key
        map.remove("A");
        System.out.println(map); //{B=b, C=c}
        // 6、清空一个map
        map.clear();
        System.out.println(map); //{}
        // 7、判断map是否为空
        map.isEmpty();// true

        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        // 遍历方式一：键找值
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+":"+map.get(key));
        }
        // 遍历方式二：键值对

        // 遍历方式三：lambda表达式

    }
}
