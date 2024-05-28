public class linked_list_cycle_ii {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        ListNode f = head;
        ListNode s = head;
        while(f.next!=null && f.next.next!=null)
        {
            s = s.next;
            f = f.next.next;
            if(s==f)
            {
                ListNode p = head;
                while(p!=s)
                {
                    p = p.next;
                    s = s.next;
                }
                return p;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
}
