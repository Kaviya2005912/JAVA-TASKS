import java.util.*;
class Node{
  int data;
  Node prev;
  Node next;
  Node(int data)
  {
    this.data = data;
    this.prev = null;
    this.next = null;
  }
}
class DoublyLinkedList1{
    Node head=null;
    Node tail = null;
    void insertAtEnd(int data)
    {
        Node NewNode = new Node(data);
        if(head==null)
        {
            head = tail = NewNode;
            return;
        }
        tail.next = NewNode;
        NewNode.prev = tail;
        tail = NewNode;
    }
    void insertStart(int data)
    {
        Node NewNode = new Node(data);
        if(head==null)
        {
            head = tail = NewNode;
            return;
        }
        head.prev = NewNode;
        NewNode.next = head;
        head = NewNode;
    }
    void insertAtPosition(int data, int pos)
    {
        Node NewNode = new Node(data);
        if(pos==1)
        {
            insertStart(data);
            return;
        }
        Node temp = head;
        for(int i=1; i<pos-1 && temp!=null; i++)
        {
            temp = temp.next;
        }
        if(temp==null)
        {
            System.out.println("Position out of bounds");
            return;
        }
        NewNode.next = temp.next;
        if(temp.next!=null)
        {
            temp.next.prev = NewNode;
        }
        temp.next = NewNode;
        NewNode.prev = temp;
    }
    void deleteAtStart()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head!=null)
        {
            head.prev = null;
        }
    }
    void deleteAtEnd()
    {
        if(tail==null)
        {
            System.out.println("List is empty");
            return;
        }
        tail = tail.prev;
        if(tail!=null)
        {
            tail.next = null;
        }
    }
    void traversalForward()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Doubledelete {
    public static void main(String[] args) {
        DoublyLinkedList1 list = new DoublyLinkedList1();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertStart(5);
        list.insertAtPosition(15, 3);
        System.out.println("Original List:");
        list.traversalForward();
        list.deleteAtStart();
        System.out.println("After deleting at start:");
        list.traversalForward();
        list.deleteAtEnd();
        System.out.println("After deleting at end:");
        list.traversalForward();
        
    }
}