package LinkedList;

/**
 * Created by kunal on 1/20/17.
 */
public class SinglyLinkedList {


    private ListNode head;

    public SinglyLinkedList(){

            head = null;

        }

        public  void insertAtBegin(int val)

        {
            ListNode node = new ListNode(val);
            node.setNext(head);
            head = node;

        }

        public void insertAtEnd(int val)
        {

            ListNode node = new ListNode(val);
            node.setNext(null);
            if(head==null)
            {
                head = node;
            }

            else{

                ListNode temp=head;

                while(temp.getNext()!=null)

                {
                    temp =temp.getNext();
                }

                temp.setNext(node);
            }
        }

        public ListNode deleteAtEnd()
        {

            ListNode temp = head;
            ListNode prvnode=null;

            if(head==null)
            {
                return  null;
            }

            if(head.getNext()==null)
            {
                head=null;
                return temp;
            }

            while(temp.getNext()!=null)
            {
                prvnode=temp;
                temp =temp.getNext();
            }

            prvnode.setNext(null);

            return temp;

        }

        public ListNode delAtBegin()

        {
            ListNode temp = head;
            if(temp==null)
            {
                return null;
            }
            else
                {

                    head=temp.getNext();
                    temp.setNext(null);
                    return temp;
            }

        }


        public void insertAtSpecificPosition(int data, int index)
        {

            ListNode temp = head;

            if(head==null)
            {
                ListNode newnode = new ListNode(data);
                head = newnode;
                head.setNext(null);

            }

           else if(index==0)

            {
                ListNode newnode = new ListNode(data);
                newnode.setNext(head);
                head = newnode;


            }

            else {

                for(int i=1;i<index;i++)
                {

                    temp =temp.getNext();

                }

                ListNode node = new ListNode(data);
                node.setNext(temp.getNext());
                temp.setNext(node);

            }



        }


        public  void ListDisplay()

    {

        ListNode temp = head;
        while(temp!=null){

            int x= temp.displayNode();
            System.out.println(x+"");
            temp=temp.getNext();
        }

    }


        public static void main(String[] args)

        {

            SinglyLinkedList list = new SinglyLinkedList();
            list.insertAtBegin(20);
            list.insertAtBegin(30);
            System.out.println("Output after insertion at begining");
            list.ListDisplay();
            list.insertAtEnd(60);
            list.insertAtEnd(70);
            list.insertAtEnd(80);
            System.out.println("Output after insertion at end");
            list.ListDisplay();
            System.out.println("Output after deletion at end");
            System.out.println("Deleted Node "+list.deleteAtEnd().data);
            list.ListDisplay();
            System.out.println("Deleted Node "+list.delAtBegin().data);
            list.ListDisplay();
            System.out.println("Inserting at specific posn");
            list.insertAtSpecificPosition(3,0);
            System.out.println("Inserting at specific posn");
            list.ListDisplay();
            list.insertAtSpecificPosition(5,1);
            System.out.println("Inserting at specific posn");
            list.ListDisplay();
            list.insertAtSpecificPosition(4,2);
            System.out.println("Inserting at specific posn");
            list.ListDisplay();
            list.insertAtSpecificPosition(2,3);
            System.out.println("Inserting at specific posn");
            list.ListDisplay();
            list.insertAtSpecificPosition(10,1);
            System.out.println("Inserting at specific posn");
            list.ListDisplay();
            list.insertAtSpecificPosition(100,4);
            System.out.println("Inserting at specific posn");
            list.ListDisplay();

        }


}
