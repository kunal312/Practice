package MixedQuestions;
import java.util.HashMap;

/**
 * Created by kunal on 4/19/18.
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

 get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

 Follow up:
 Could you do both operations in O(1) time complexity?

 Example:

 LRUCache cache = new LRUCache( 2 /* capacity */



//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.get(1);       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        cache.get(2);       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        cache.get(1);       // returns -1 (not found)
//        cache.get(3);       // returns 3
//        cache.get(4);       // returns 4

public class LRUCache {

    //Approcach
    /*
    We will use doubly linked list and whenever get or put is called we move that value to head
     we keep on increasing the count whenever we insert the elements. if count is greater than capacity we remove the least recent
     used element from tail.
    *
    * */

    //Doubly Linked List node class
    class DLinkedNode{

        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode next;
    }


    private HashMap<Integer,DLinkedNode> cache;
    private int count;
    private int capacity;
    private DLinkedNode head,tail;

    public LRUCache(int capacity){

    this.capacity = capacity;
    cache =  new HashMap<Integer,DLinkedNode>();
    this.count = 0;

    //Link head and tail
    head = new DLinkedNode();
    tail = new DLinkedNode();
    head.pre = null;
    head.next = tail;
    tail.pre = head;
    tail.next = null;


    }

    //get method
    public int get(int key){
        DLinkedNode node = cache.get(key);
        if(node == null)
            return -1;

        //return node  and move this node to first postion
        this.moveToFirst(node);
        return node.value;

    }
    //put method
    public void put(int key, int value){

        DLinkedNode node = cache.get(key);
        if(node == null){
            //Create new node and put into cache and move to first
            //check if count >capacity remove the node from tail
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            this.cache.put(key,newNode);
            this.addAfterHead(newNode);
            count++;
            if(count>capacity) {
                //pop the last element from tail
                DLinkedNode tail = this.popFromTail();
                this.cache.remove(tail.key);
                --count;
            }
            //create a new node
        }else{
            //update the value since key already exists and move this node ahead since its used again
           node.value = value;
           this.moveToFirst(node);
        }

    }

    private DLinkedNode popFromTail(){
        DLinkedNode node = tail.pre;
        this.removeNode(node);
        return node;
    }

    private void moveToFirst(DLinkedNode node){
        //Moving this node is two step process,i) remove node form its current positon ii) Move node after head

        this.removeNode(node);
        this.addAfterHead(node);

    }

    private void removeNode(DLinkedNode node){
        DLinkedNode pre = node.pre;
        DLinkedNode next = node.next;
        pre.next = next;
        next.pre = pre;
    }

    private void addAfterHead(DLinkedNode node){
        node.pre = head;
        node.next = head.next;
        head.next = node;
        node.next.pre = node;

    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        //int param_1 = obj.get(1);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));// returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4));// returns 4
    }




}
