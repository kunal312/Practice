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

    SumLists newnode;

    public SumLists(int data)
    {
        this.data = data;
    }

    public void insertAtEnd(int data)
    {

        SumLists newnode = new SumLists(data);

        if (head==null)
        {
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

    public SumLists CalculateSum(SumLists l1,SumLists l2)
    {
        int carry = 0;

        while(l1!=null || l2!=null){
            int sum =0;

            sum = sum+carry;


            if(l1!=null)
            {
                sum = sum + l1.data;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum = sum +l2.data;
                l2=l2.next;
            }

            carry = sum/10;
            insertAtEnd(sum%10);

        }

        if(carry>0){
            insertAtEnd(carry);
        }

        return newnode;
    }



    public static void main(String[] args)
    {

        SumLists list1 = new SumLists();
        list1.insertAtEnd(2);
        list1.insertAtEnd(4);
        list1.insertAtEnd(3);
        SumLists list2 = new SumLists();
        list2.insertAtEnd(5);
        list2.insertAtEnd(6);
        list2.insertAtEnd(4);
        SumLists l = new SumLists();
        SumLists sum = l.CalculateSum(list1.head,list2.head);
        while(sum!=null){
            System.out.println("Sum:"+sum.data);
            sum=sum.next;
        }




    }

}
