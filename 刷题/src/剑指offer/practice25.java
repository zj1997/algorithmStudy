package 剑指offer;

public class practice25 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;
        ListNode Nm = new ListNode(0);
        ListNode m = Nm;
        while(p != null && q != null){
            if(p.val > q.val){
                ListNode mq = new ListNode(q.val);
                m.next = mq;
                m=m.next;
                q = q.next;
            }else if(p.val < q.val){
                ListNode mq = new ListNode(p.val);
                m.next = mq;
                m=m.next;
                p = p.next;
            }else{
                ListNode mq1 = new ListNode(p.val);
                ListNode mq2 = new ListNode(p.val);
                mq1.next = mq2;
                m.next = mq1;
                m=m.next.next;
                p = p.next;
                q = q.next;
            }
        }

        if(q != null){
            while(q !=null){
                ListNode mq = new ListNode(q.val);
                m.next = mq;
                m=m.next;
                q=q.next;
            }
        }

        if(p != null){
            while(p !=null){
                ListNode mq = new ListNode(p.val);
                m.next = mq;
                m=m.next;
                p=p.next;
            }
        }
        return Nm.next;
    }
}
