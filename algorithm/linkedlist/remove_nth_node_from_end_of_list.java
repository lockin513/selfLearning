public class remove_nth_node_from_end_of_list {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummyhead = new ListNode(0,head);
            ListNode p = dummyhead;
            int size = 0;
            while(p.next!=null)
            {
                p=p.next;
                size++;
            }
            p=dummyhead;
            for(int i=0;i<size-n;i++)p=p.next;
            p.next=p.next.next;
            return dummyhead.next;
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
