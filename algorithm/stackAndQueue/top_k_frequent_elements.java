import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class top_k_frequent_elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))hm.put(nums[i],1);
            else hm.put(nums[i],hm.get(nums[i])+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>(){
            public int compare(int[] m, int[] n){
                return m[1] - n[1];
            }
        });
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int num = entry.getKey(), count = entry.getValue();
            if(queue.size()==k){
                if(queue.peek()[1]<count){
                    queue.poll();
                    queue.offer(new int[]{num,count});
                }
            }else queue.offer(new int[]{num,count});
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)ans[i] = queue.poll()[0];
        return ans;
    }
}
