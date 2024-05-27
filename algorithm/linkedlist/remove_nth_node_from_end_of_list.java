public class remove_nth_node_from_end_of_list {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyhead = new ListNode(-1,head);
        ListNode f = dummyhead;
        ListNode s = dummyhead;
        int len = n;
        while(len>0)
        {
            f = f.next;
            len--;
        }
        while(f.next!=null)
        {
            f = f.next;
            s = s.next;
        }
        s.next = s.next.next;
        return dummyhead.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
