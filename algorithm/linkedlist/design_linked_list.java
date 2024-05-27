public class design_linked_list {
    class MyLinkedList {
        int size;
        ListNode head;

        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        public int get(int index) {
            if(index<0 || index>=size)return -1;
            ListNode p = head;
            for(int i=0;i<=index;i++)
            {
                p = p.next;
            }
            return p.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0,val);
        }

        public void addAtTail(int val) {
            addAtIndex(size,val);
        }

        public void addAtIndex(int index, int val) {
            if(index>size)return;
            index = Math.max(0,index);
            ListNode add = new ListNode(val);
            ListNode p = head;
            for(int i=0;i<index;i++)
            {
                p = p.next;
            }
            add.next = p.next;
            p.next = add;
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index<0 || index>=size)return;
            ListNode p = head;
            for(int i=0;i<index;i++)
            {
                p = p.next;
            }
            p.next = p.next.next;
            size--;
        }
    }

    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
