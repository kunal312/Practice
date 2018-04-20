package MixedQuestions;

import java.util.LinkedList;

/**
 * Created by kunal on 4/19/18.
 *
 * Implement HashTable
 *
 */
public class HashTable {

    //Internal LinkedList class
    private static class ListNode{
        String key;
        String value;
        ListNode next;
    }

    private ListNode[] table;

    private int count;

    public HashTable(int capacity){
        table = new ListNode[capacity];
    }

    public void put(String key, String value){

        //The key must not be null

        int bucket = hash(key);

        //Now get the list at that hashcode or bucket address and check if already exists
        ListNode list  = table[bucket];
        while(list!=null){
            if(list.key.equals(key))
                break;
            list = list.next;
        }
        if(list!=null){
            //we found already existing key just change the value
            list.value = value;
        }else{
            //meaning list reached the last point and key is not in the list so we add in the linked list
            //so we add the new key at the head of the linked list

            if(count>=0.7 * table.length){
                //the table is full risize
                resize();
                bucket = hash(key); //Recomputing since we increased the size and hash depends on table lenght
            }

            //adding new node  consider, table[bucket] as head
            ListNode newNode = new ListNode();
            newNode.key = key;
            newNode.value = value;
            newNode.next = table[bucket];
            table[bucket] = newNode;
            count++;

        }

    }


    public String get(String key){

        int bucket=hash(key);
        ListNode list = table[bucket];
        while(list!=null){
            if(list.key.equals(key))
                return list.value;
            list = list.next;
        }
        return null;
    }

    public void remove(String key){
        int bucket = hash(key);

        //if below condition is true that means there are no keys at that location hence do nothing
        if(table[bucket]==null) return;

        if(table[bucket].key.equals(key)){
            //that means first node on the list matches then we should elminate first node
            table[bucket] = table[bucket].next;
            count--;
            return;
        }

        //if we have to remove node from somewhere middle use a pointer to find a node and remove
        ListNode prev = table[bucket];
        ListNode curr = prev.next;

        while(curr!=null && !curr.key.equals(key)){
            curr = curr.next;
            prev = curr;
        }

        //if we get to this point either our curr is at exact key or at the end
        if(curr!=null){
            prev.next = curr.next;
            count--;
        }
    }

    public boolean containsKey(String key){
        int bucket = hash(key);
        ListNode list = table[bucket];
        while(list!=null){
            if(list.key.equals(key))
                return true;
            list = list.next;
        }
        return false;
    }

    public int size(){
        return count;
    }

    //Returns the hash code /address of the bucket
    private int hash(Object key){
        //HashCode depends on size of table as well as the value of key that is returned by key.hashCode
        return (Math.abs(key.hashCode())) % table.length;

    }

    private void resize(){
        ListNode[] newTable = new ListNode[table.length *2];

        for(int i=0;i<table.length;i++){
            //Every index at table is a linked list so we iterate over each list, so we will move each list in newtable by generating its hashcode again
            ListNode list = table[i];
            while(list!=null){

                //save the next of this list since we are going to move it to newTable
                ListNode next = list.next;

                //Recompute the hashcode with new tablelength
                int hash = (Math.abs(list.key.hashCode()))%newTable.length;

                list.next = newTable[hash];
                newTable[hash] = list;
                list = next;
            }
        }
        //copy the newtable to table
        table = newTable;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(4);
        //System.out.println();
        table.put("a","a");
        table.put("b","b");
        table.put("a","c");
        table.put("d","c");
        table.put("e","c");
        System.out.println(table.size());
        System.out.println(  table.containsKey("c"));
        System.out.println(  table.containsKey("b"));
        System.out.println(table.get("a"));

    }

}
