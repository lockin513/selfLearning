public class intersection_of_two_inked_lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lena = 0;
        int lenb = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=null)
        {
            a = a.next;
            lena++;
        }
        while(b!=null)
        {
            b = b.next;
            lenb++;
        }
        a = headA;
        b = headB;
        if(lena>=lenb)return findP(a,b,lena-lenb);
        else return findP(b,a,lenb-lena);
    }

    ListNode findP(ListNode l, ListNode s, int diff)
    {
        while(diff>0)
        {
            l = l.next;
            diff--;
        }
        while(l!=null)
        {
            if(l==s)return l;
            else
            {
                l = l.next;
                s = s.next;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
