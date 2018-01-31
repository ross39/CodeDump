// the problem states that we must remove duplicates from an unsorted linked list
//the obvious answer would be to use i and j to iterate over the loop and remove duplicates
//we will use hashing. 0(N) assuming hashing access is 0(1).
import java.util.*;
import java.io.*;

public class duplicatesLinkedList
{

    static class node
    {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }
    //method to remove duplicates
    static void remove(node head)
    {
        HashSet<Integer> H = new HashSet<>();
        node current = head;
        node prev = null;
        while(current != null)
        {
            int curr = current.val;

            if(H.contains(curr))
                prev.next = current.next;
            else
            {
                H.add(curr);
                prev = current;
            }
            current = current.next;
        }
    }
    
    //function to print out the results
    static void printList(node head)
    {
        while(head != null)
        {
            System.out.println(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) 
    {
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(12);
        start.next.next.next.next.next = new node(11);
        start.next.next.next.next.next.next = new node(10);
 
        System.out.println("Linked list before removing duplicates :");
        printList(start);
 
        remove(start);
 
        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }
}