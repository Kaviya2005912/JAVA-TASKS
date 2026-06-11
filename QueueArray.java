import java.util.*;
class Queue {
    int[] arr;
    int front, rear, size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        arr[++rear] = data;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return arr[front++];
    }

    int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        System.out.print("Queue after dequeue: ");
        q.display();

        System.out.println("Front element: " + q.peek());
    }
}