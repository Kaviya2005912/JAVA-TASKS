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
class DoublyLinkedList{
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
      for(int i=1;i<pos-1;i++)
      {
          temp = temp.next;
      }
      NewNode.next = temp.next;
      if(temp.next!=null)
      {
          temp.next.prev = NewNode;
      }
      temp.next = NewNode;
      NewNode.prev = temp;
  }
void traversalForward()
{
    Node temp = head;
    while(temp!=null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
    void traversalBackward()
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
public class Double1 {
    public static void main(String[] args) {
      //Node nN = new Node(10);
      DoublyLinkedList dll = new DoublyLinkedList();
      //System.out.println(nN.prev + "->" + nN.data + "->" + nN.next);
      dll.insertAtEnd(20);
      dll.insertAtEnd(30);
      dll.insertAtEnd(40);
      dll.insertStart(10);
      dll.insertAtPosition(25, 3);
      dll.traversalForward();
      dll.traversalBackward();
      /*System.out.println(dll.head.data + " " + dll.tail.prev.data + " " + dll.tail.prev.prev.data 
      + " " + dll.tail.prev.prev.prev);*/
      
    }
}