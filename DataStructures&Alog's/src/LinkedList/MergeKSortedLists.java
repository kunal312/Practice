package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by kunal on 4/20/18.
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

 Example:

 Input:
 [
 1->4->5,
 1->3->4,
 2->6
 ]
 Output: 1->1->2->3->4->4->5->6
 */
public class MergeKSortedLists {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val= x;
        }
    }

    public ListNode mergeKList(ListNode[] lists){

        if(lists ==null || lists.length == 0 ) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

        ListNode head = new ListNode(0);
        ListNode  p = head;
        for(ListNode list: lists){
            if(list!=null) queue.offer(list);
        }

        while(!queue.isEmpty()){
            ListNode n = queue.poll();
            p.next = n;
            p=p.next;
            if(n.next!=null){
                queue.offer(n.next);
            }
        }
        return head.next;
    }
}
