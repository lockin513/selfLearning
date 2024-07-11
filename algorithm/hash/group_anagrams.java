import java.util.*;

public class group_anagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            // 创建一个哈希映射，键是排序后的字符串，值是所有对应的异位词
            Map<String, List<String>> map = new HashMap<String, List<String>>();

            // 遍历输入的字符串数组
            for (String str : strs) {
                // 将当前字符串转换为字符数组
                char[] array = str.toCharArray();
                // 对字符数组进行排序
                Arrays.sort(array);
                // 将排序后的字符数组转换回字符串，作为哈希映射的键
                String key = new String(array);
                // 从哈希映射中获取键对应的异位词列表，如果不存在则返回一个新的列表
                List<String> list = map.getOrDefault(key, new ArrayList<String>());
                // 将当前字符串添加到异位词列表中
                list.add(str);
                // 将异位词列表放回哈希映射中
                map.put(key, list);
            }
            // 将哈希映射中的所有值（即所有的异位词列表）转换为一个列表返回
            return new ArrayList<List<String>>(map.values());
        }
    }
}
