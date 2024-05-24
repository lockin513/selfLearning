public class swap_nodes_in_pairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null)return head;
        ListNode dummyhead = new ListNode(-1,head);
        ListNode cur = dummyhead;
        while(cur.next!=null && cur.next.next!=null)
        {
            ListNode temp = cur.next;
            ListNode temp1 = temp.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp;
            temp.next = temp1;
            cur = cur.next.next;
        }
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
