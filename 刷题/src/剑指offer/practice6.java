package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

public class practice6 {

    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {

        Stack<Integer> stack = new Stack<Integer>();

        while(listNode !=null){
            stack.push(listNode.val);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(Integer node : stack){
            list.add(stack.pop());
        }

        return list;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

       if(listNode == null){
           ArrayList<Integer> list = new ArrayList<>();
           return list;
       }
        ArrayList<Integer> list = printListFromTailToHead(listNode.next);

        list.add(listNode.val);

        return list;
    }

}
