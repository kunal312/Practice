package LinkedList;

import java.util.List;

/**
 * Created by kunal on 1/24/17.
 */
public class CircularLLImplementation {




    private int length=0;
    private CircularLLImplementation next;
    private int data;
    CircularLLImplementation tail;

    CircularLLImplementation(){
        tail=null;
        }

    CircularLLImplementation(int data){
        this.data = data;
        this.next=null;
    }

    public void setNext(CircularLLImplementation next)
    {
        this.next = next;
    }

    public CircularLLImplementation getNext()
    {
        return next;
    }

    //Adddata to begining

    public void addToBegin(int data)
    {

        CircularLLImplementation newnode = new CircularLLImplementation(data);

        if(tail==null)
        {

                tail = newnode;
                tail.setNext(tail);
            System.out.println("Creating first node" + tail.data);
        }
        else
            {

                newnode.setNext(tail.getNext());
                tail.setNext(newnode);

                System.out.println(newnode.data);
            }
            length++;
    }


    public void insertAtEnd(int data)
    {
        addToBegin(data);
        tail = tail.getNext();
    }


    public int deleteHead()
    {

        CircularLLImplementation temp1 =tail.getNext();

        if(tail==tail.getNext())
        {

            tail=null;

        }

        else{

            tail.setNext(tail.getNext().getNext());
            temp1.setNext(null);

        }
        return temp1.data;
    }


    public void displayList()
    {
        if(tail==null)//if empty list
        {
            System.out.println("List is empty");
        }
        else {
            if (tail == tail.getNext())//if only one node exists
            {
                System.out.println("Only one node " + tail.data);

            } else {

                CircularLLImplementation temp=tail.getNext();
                while (temp!= tail) {

                    System.out.println(temp.data);

                    temp = temp.getNext();


                }
                System.out.println(temp.data);
            }
        }


    }


    public static void main(String[] args)
    {

        CircularLLImplementation clist = new CircularLLImplementation();
       clist.addToBegin(10);
       clist.addToBegin(20);
       clist.addToBegin(30);
       clist.displayList();
        clist.insertAtEnd(40);
        clist.insertAtEnd(50);
        clist.displayList();
        System.out.println("Deleted Node:"+clist.deleteHead());
        clist.displayList();


    }




}
