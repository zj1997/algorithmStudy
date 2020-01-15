package leetcode.top100;

import 剑指offer.ListNode;

import java.util.ArrayList;
import java.util.List;

public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode p =head;
            List<Integer> list = new ArrayList<>();
            while(p!=null){
                list.add(p.val);
                p=p.next;
            }

            list.remove(list.size()-n);

            if(list.isEmpty()){
                return null;
            }

            ListNode m = null;
            ListNode Nhead = new ListNode(list.get(0));
            m=Nhead;
            for(int i = 1 ;i<list.size();i++){
                ListNode listNode = new ListNode(list.get(i));
                m.next=listNode;
                m=listNode;
            }
            return Nhead;
        }
    }
