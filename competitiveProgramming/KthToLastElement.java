//find the kth last elemet of a singly linked list
import java.util.*;
import java.io.*;
public class KthToLastElement
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            date = d;
            next = null;
        }
    }

    public void printNthFromLast(int n)
    {
        node main_ptr = head;
        node second_ptr = head;

        int count = 0;
        if(head != null)
        {
            while(count < n)
            {
                if(second_ptr == null)
                {
                    System.out.println(n + "Is greater than the no of nodes in the list");
                    return;
                }
                second_ptr = second_ptr.next;
                count++;
            }
            while(second_ptr != null)
            {
                main_ptr = main_ptr.next;
                second_ptr = second_ptr.next;
            }
            System.err.println("Node No " + n + "from last is " + main_ptr.data);
        }
    }

    public void push(int new_data)
    {
        node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args) 
    {
        KthToLastElement list = new KthToLastElement();
        list.push(20);
        list.push(45);
        list.push(6);
        list.push(11);
        list.printNthFromLast(4);
        
    }
}