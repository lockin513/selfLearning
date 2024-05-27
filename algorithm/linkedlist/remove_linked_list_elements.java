public class remove_linked_list_elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = new ListNode(0);
        p = head;
        if(head==null)return head;
        while(p.next!=null)
        {
            if(p.next.val==val)
            {
                p.next = p.next.next;
            }
            else p = p.next;
        }
        return head.val!=val?head:head.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
