package LinkedList;

import java.util.HashSet;

/**
 * Created by kunal on 1/25/17.
 */
public class RemoveDuplicate {


    public int data;
    public RemoveDuplicate next;

    public static RemoveDuplicate head;

    public RemoveDuplicate()
    {}

    public RemoveDuplicate(int data)
    {
        this.data = data;
        this.next = null;
    }



    public void insertAtEnd(int val)
    {

        RemoveDuplicate node = new RemoveDuplicate(val);


        if(head==null)
        {
            head = node;
        }

        else{

            RemoveDuplicate temp=head;

            while(temp.next!=null)

            {
                temp =temp.next;
            }

            temp.next=node;
        }
    }

    public  void ListDisplay()

    {

        RemoveDuplicate temp = head;
        while(temp!=null){

            int x= temp.data;
            System.out.println(x+"");
            temp=temp.next;
        }

    }

    public void removeDuplicates()

    {

        RemoveDuplicate temp=head;
        RemoveDuplicate prev = null;
        HashSet<Integer> set = new HashSet<Integer>();
        while(temp!=null)
        {


            if(set.contains(temp.data))
            {
                prev.next = temp.next;
            }
            else{
                set.add(temp.data);
                prev = temp;
            }

            temp=temp.next;
       }


        //Brute force// when temp buffer not to be used

//        while(temp!=null)
//        {
//            RemoveDuplicate runner = temp;
//            while(runner.next!=null)
//            {
//                if(runner.next.data==temp.data)
//                {
//                    runner.next=runner.next.next;
//                }else{
//                    runner=runner.next;
//                }
//            }
//            temp=temp.next;
//        }


    }


    public int  findKthNodefromLast(RemoveDuplicate head,int k)
    {


    //Recursive Approach
//     if(head==null)
//     {
//         System.out.println("Head is null");
//         return 0;
//
//     }
//
//     int index= findKthNodefromLast(head.next,k);
//        System.out.println("Increasing index"+index);
//        index++;
//
//
//        if(index==k)
//        {
//            System.out.println("Data on kth posn from last:"+head.data);
//
//        }
//
//        return index;
//

        //Iterative Approach

        RemoveDuplicate slow=head;
        RemoveDuplicate fast =head;

        for(int i=0;i<k;i++)
        {
            System.out.println("i:"+i);
            fast=fast.next;
        }

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        System.out.println("Value at kth posn from last:"+slow.data);
        return slow.data;

    }//End of MEthod findkthfromlast

    //Have access just to the node to be deleted not head node.

    public void deleteAtSpecificPosn(RemoveDuplicate node)
    {

//        RemoveDuplicate prev=node;
//        if(node.next==null || node==null)
//        {
//            System.out.println("Nothing to delete");
//        }
//
//        while(node.next!=null)
//        {
//            node.data=node.next.data;
//            prev=node;
//            node=node.next;
//
//        }
//
//        if(prev.next.next==null)
//        {
//            prev.next=null;
//        }

        //Method 2
        if(node==null || node.next!=null)
        {
            System.out.println("Nothing to delete");
        }
        node.data=node.next.data;
        node.next=node.next.next;


    }


    public void partitionLinkedList(RemoveDuplicate head,int data)
    {

        System.out.println("head data"+head.data);
        RemoveDuplicate LessList = new RemoveDuplicate();
        RemoveDuplicate GreaterList = new RemoveDuplicate();
        //RemoveDuplicate MergeList=new RemoveDuplicate();
        RemoveDuplicate temp=head;

        while(temp.data!=100)
        {
            System.out.println("temp value"+temp.data);
            if(temp.data<data){

            LessList.insertAtEnd(temp.data);


            }
            else{

                GreaterList.insertAtEnd(temp.data);
            }

            temp=temp.next;

        }

        System.out.println("After splitting ");

               LessList.ListDisplay();


    }

    public  void NewListDisplay(RemoveDuplicate l1)

    {

        RemoveDuplicate temp = l1;
        while(temp!=null){

            int x= temp.data;
            System.out.println(x+"");
            temp=temp.next;
        }

    }


    public static void main(String[] args)


    {
        RemoveDuplicate r = new RemoveDuplicate();

        r.insertAtEnd(10);
        r.insertAtEnd(20);
        r.insertAtEnd(30);
        r.insertAtEnd(40);
        r.insertAtEnd(50);
        r.insertAtEnd(50);
        r.insertAtEnd(60);
        r.insertAtEnd(70);
        r.insertAtEnd(80);
        r.insertAtEnd(80);
        r.insertAtEnd(80);
        r.insertAtEnd(20);
        r.insertAtEnd(10);
        r.insertAtEnd(90);
        r.insertAtEnd(100);
        r.ListDisplay();
        System.out.println("After removing duplicates");
        r.removeDuplicates();
        r.ListDisplay();
        //System.out.println("Kth Posn from last");
        //r.findKthNodefromLast(head,4);
//        System.out.println("After delete middle node ctci");
//        r.deleteAtSpecificPosn(head.next.next.next);
//        r.ListDisplay();
        System.out.println("Splitting");
        r.partitionLinkedList(head,50);



    }

}
