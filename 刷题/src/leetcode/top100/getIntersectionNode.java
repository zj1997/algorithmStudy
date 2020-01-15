package leetcode.top100;

import 剑指offer.ListNode;

public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null){
            return null;
        }

        ListNode pA = headA,pB = headB;

        while(pA != pB){
            pA = pA == null? pB : pA.next;
            pB = pB == null? pA : pB.next;
        }
        return pA;
    }
}
