package 剑指offer;

public class practice18 {

    public ListNode deleteDuplication(ListNode pHead)
    {
         ListNode head =pHead;
         ListNode p1 =pHead;
         ListNode p2 = pHead;
         int count =0;
         if(pHead == null || pHead.next ==null){
             return pHead;
         }

        if (p2.next.val != p1.val) {
            head = pHead;
        }else {
            while(p2!=null) {
                p2=p2.next;
                count ++;
                if (p2.next.val != p1.val) {
                    if(count == 1){

                    }
                    p1 = p2;
                } else {
                    continue;
                }
            }


        }

return null;
    }
}
