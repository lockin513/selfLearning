import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class reconstruct_itinerary {
    class Solution {
        LinkedList<String> path = new LinkedList<>();

        public List<String> findItinerary(List<List<String>> tickets) {
            Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
            path.add("JFK");
            boolean[] used = new boolean[tickets.size()];
            backTracking(tickets, used);
            return path;
        }

        public boolean backTracking(List<List<String>> tickets, boolean[] used) {
            if(path.size()==tickets.size()+1)return true;
            for(int i=0;i<tickets.size();i++)
            {
                if(!used[i] && tickets.get(i).get(0).equals(path.getLast()))
                {
                    path.add(tickets.get(i).get(1));
                    used[i]=true;
                    if(backTracking(tickets,used))return true;
                    used[i]=false;
                    path.removeLast();
                }
            }
            return false;
        }
    }
}
