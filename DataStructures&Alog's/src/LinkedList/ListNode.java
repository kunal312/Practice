package LinkedList;

/**
 * Created by kunal on 1/20/17.
 */
public class ListNode {

    public int data;
    public ListNode next;


    public ListNode(int data)
    {

        this.data = data;
    }

    public int displayNode(){
      return data;

    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {

        return this.next;
    }

    /*public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return this.next;
    }
*/
}










    /*public static void main(String[] args)
    {

        ListNode list = new ListNode();
        list.setData(10);

        list.setData(20);
        list.setData(30);
        list.setData(40);
        list.setData(50);






    }
    */










