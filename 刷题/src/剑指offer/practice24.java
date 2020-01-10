package 剑指offer;

public class practice24 {

    public ListNode ReverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        int valH = head.val;
        ListNode ph = head;
        ListNode Nhead = new ListNode(valH);
        Nhead.next = null;
        ListNode p = new ListNode(0);
        p.next = Nhead;
        ph = ph.next;
        while(ph!= null){
            valH = ph.val;
            ListNode node = new  ListNode(valH);
            node.next = p.next;
            p.next = node;
            ph = ph.next;
        }
        return p.next;
    }

}
