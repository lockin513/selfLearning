public class reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode pre = null;
        while(p!=null)
        {
            ListNode temp = p.next;
            p.next = pre;
            pre = p;
            p = temp;
        }
        return pre;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
