package LinkedList;

/**
 * Created by kunal on 4/20/18.
 */
public class Merge2SortedLinkedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //Create a dummy node
        ListNode head = new ListNode(0);
        ListNode p = head;

        if(l1==null) return l2;
        if(l2==null) return l1;

        //Point the p pointer to smallest of them
        if(l1!=null && l2!=null){
            if(l1.data<l2.data){
                p =l1;
                l1=p.next;

            }else{
                p =l2;
                l2=p.next;
            }
            //Assign head as it is the starting point so we keep head
            head = p;
        }

        while(l1!=null && l2!=null){
            //assign the next pointer to next smallest node and move the p pointer ahead and l1 to p's next.
            if(l1.data<l2.data){
                p.next =l1;
                p=l1;
                l1=p.next;
            }else{
                p.next =l2;
                p=l2;
                l2=p.next;
            }
        }

        //if length is unequal join reminaing list respectively

        if(l1==null) p.next = l2;
        if(l2==null) p.next = l1;

        return head;
    }


}
