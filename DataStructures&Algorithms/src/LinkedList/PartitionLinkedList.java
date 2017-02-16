    package LinkedList;




    /**
     * Created by kunal on 1/27/17.
     */
    public class PartitionLinkedList {


        public int data;
        public PartitionLinkedList next;
        public static PartitionLinkedList  head=null;

        public PartitionLinkedList()
        {
        }

        public PartitionLinkedList(int data)
        {
            this.data =data;
        }

        public void insertAtEnd(int data)
        {

            PartitionLinkedList newnode = new PartitionLinkedList(data);

            if (head==null)
            {
                System.out.println("head");
                head=newnode;
                head.next=null;
            }
            else
                {
                    PartitionLinkedList temp =head;
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    temp.next=newnode;
                    newnode.next=null;

             }
        }

        public void dislayList()
        {
            PartitionLinkedList temp = head;
            while(temp!=null)

            {
                System.out.println("Data: "+temp.data);
                temp=temp.next;
            }



        }
//
//       // Method 1- Creating two lists and mergin them in the end. In one list link the less numbers than pivot and in another link the higher numbers than pivot
//
//          public void partitionList(int k) {
//
//                PartitionLinkedList root = new PartitionLinkedList(0);
//                PartitionLinkedList pivot = new PartitionLinkedList(data);
//                PartitionLinkedList rootnext = root;
//                PartitionLinkedList pivotnext =pivot;
//                PartitionLinkedList current = head;
//
//                while (current!= null )
//                {
//                    if(current.data<k)
//                    {
//                        System.out.println("Less:"+current.data);
//                        rootnext.next=current;
//                        rootnext=current;
//
//                    }
//
//                    else{
//
//                        System.out.println("More:"+current.data);
//                        pivotnext.next=current;
//                        pivotnext = current;
//                    }
//                    current = current.next;
//
//                }
//                pivotnext.next=null;
//                rootnext.next = pivot.next;
//
//                System.out.println("Displaying new list");
//                PartitionLinkedList temp4=root.next;
//                while(temp4!=null)
//                {
//                    System.out.println(temp4.data);
//                    temp4=temp4.next;
//                }
//
//            }

        //Method 2 add less numbers at head and more numbers at tail
        public void partitionList(int k)
        {

            System.out.println("In partition list");
            PartitionLinkedList head1 = head;
            PartitionLinkedList tail =  head;


            while(head!=null)
            {
                PartitionLinkedList next = head.next;
                if(head.data<k)
                {

                    System.out.println("less:"+head.data);
                    head.next=head1;
                    head1=head;


                }
                else{

                    System.out.println("more:"+head.data);
                    tail.next = head;
                    tail = head;
                }
                head = head.next;
            }
            tail.next=null;

            System.out.println("Displaying list:");
            PartitionLinkedList temp4=head1;
            while(temp4!=null)
            {
                System.out.println("New List: "+temp4.data);
                temp4=temp4.next;
            }





        }






        public static void main(String[] args)

        {


            PartitionLinkedList node = new PartitionLinkedList();
            node.insertAtEnd(4);
            node.insertAtEnd(1);
            node.insertAtEnd(3);
            node.insertAtEnd(2);
            node.insertAtEnd(5);
            node.insertAtEnd(2);
            //node.insertAtEnd(1);

            node.dislayList();
            node.partitionList(3);


        }



    }
