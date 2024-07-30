public class remove_linked_list_elements {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode ans = new ListNode();
            ans.next=head;
            ListNode p = ans;
            while(p.next!=null)
            {
                if(p.next.val==val)p.next=p.next.next;
                else p=p.next;
            }
            return ans.next;
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
