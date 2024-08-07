public class linked_list_cycle {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode f = head;
            ListNode s = head;
            while(f!=null && f.next!=null && f.next.next!=null)
            {
                f=f.next.next;
                s=s.next;
                if(f==s)return true;
            }
            return false;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
