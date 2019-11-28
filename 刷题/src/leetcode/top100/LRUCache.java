package leetcode.top100;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    //定义节点的接口体
    private class Node{
        private int key;
        private int value;
        private Node next;
        private Node pre;
        public Node(){ }
        public Node(int key , int value){
            this.key = key;
            this.value = value;
        }

    }

    private Node nodeHead = new Node();
    private Node nodetail = new Node();
    int capcity = 0;
    int size = 0;
    private Map<Integer ,Node> map = new HashMap<Integer, Node>();


    public void addFirst(Node node){

        Node head = nodeHead.next;

        node.next = head;
        node.pre = nodeHead;
        nodeHead.next = node;
        head.pre = node;

    }

    public void del(Node node){

        Node next = node.next;
        Node pre = node.pre;

        pre.next = next;
        next.pre = pre;

        node.next = null;
        node.pre = null;
    }


    public LRUCache(int capacity) {
      nodeHead.next = nodetail;
      nodetail.pre = nodeHead;
      this.capcity = capacity;
      size = 0;
    }

    public int get(int key) {

        if(!map.containsKey(key)){
            return -1;
        }else {

            Node node = map.get(key);
            del(node);
            addFirst(node);
            return node.value;
        }
    }

    public void put(int key, int value) {

        if(!map.containsKey(key)){

            if(size <= capcity){
                size++;
            }else {
                Node pre = nodetail.pre;
                del(pre);
                map.remove(pre.key);
            }

            Node node = new Node(key,value);
            map.put(key,node);
            addFirst(node);

        }else {

            Node node = map.get(key);
            node.value = value;
            del(node);
            addFirst(node);
            map.put(key,node);
        }
    }

}
