package leetcode.top100;

import 剑指offer.ListNode;

import java.util.ArrayList;
import java.util.List;

public class isPalindrome_list {

    public boolean isPalindrome(ListNode head) {
        List list = new ArrayList();
        ListNode p =head;
        while(p!=null){
            list.add(p.val);
            p=p.next;
        }

        for(int i = 0 ;i< list.size() /2;i++){
            if(!list.get(i).equals(list.get(list.size() - 1 -i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(-129);
        ListNode list2 = new ListNode(-129);
        list.next=list2;

        System.out.println(new isPalindrome_list().isPalindrome(list));
    }
}
