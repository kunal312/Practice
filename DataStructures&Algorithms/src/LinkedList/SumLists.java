package LinkedList;

/**
 * Created by kunal on 1/29/17.
 */
public class SumLists {

    public int data;
    public SumLists next;
    public static SumLists head =null;

    public SumLists(){

    }

    public SumLists(int data)
    {
        this.data = data;
    }

    public void insertAtEnd(int data)
    {

        SumLists newnode = new SumLists(data);

        if (head==null)
        {
            System.out.println("head");
            head=newnode;
            head.next=null;
        }
        else
        {
            SumLists temp =head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=null;

        }
    }

    public void CalculateSum(SumLists l1,SumLists l2)
    {

    }



    public static void main(String[] args)
    {

        SumLists list1 = new SumLists();
        list1.insertAtEnd(6);
        list1.insertAtEnd(1);
        list1.insertAtEnd(7);
        SumLists list2 = new SumLists();
        list2.insertAtEnd(9);
        list2.insertAtEnd(1);
        list2.insertAtEnd(5);
        SumLists l = new SumLists();
        l.CalculateSum(list1.head,list2.head);




    }

}
