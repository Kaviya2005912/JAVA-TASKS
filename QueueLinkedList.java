import java.util.LinkedList;

public class QueueLinkedList {
    public static void main(String[] args) {

        java.util.Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.offer(15);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue after enqueuing: " + queue);

        Integer removedElement = queue.poll();
        System.out.println("Dequeued element: " + removedElement);

        System.out.println("Queue after dequeuing: " + queue);

        Integer frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}