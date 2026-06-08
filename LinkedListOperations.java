class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 1. Find Method
    boolean find(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // 2. Find Occurrence of a Value
    int countOccurrence(int value) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    // 3. Find Length
    int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // 4. Find Mid Value
    int findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // 5. Update Value
    void updateValue(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value not found");
    }

    // 6. Update Value Based on Position
    void updateAtPosition(int position, int newValue) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (index == position) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
            index++;
        }

        System.out.println("Invalid Position");
    }

    // Display List
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        int[] arr = {1, 2, 3, 4, 1, 1, 2};

        for (int num : arr) {
            list.insert(num);
        }

        System.out.print("List: ");
        list.display();

        // 1. Find
        System.out.println("Find 3: " + list.find(3));

        // 2. Occurrence
        System.out.println("Occurrences of 1: " + list.countOccurrence(1));

        // 3. Length
        System.out.println("Length: " + list.length());

        // 4. Middle Value
        System.out.println("Middle Value: " + list.findMiddle());

        // 5. Update Value
        list.updateValue(4, 10);
        System.out.print("After updating 4 to 10: ");
        list.display();

        // 6. Update by Position
        list.updateAtPosition(2, 99);
        System.out.print("After updating position 2 to 99: ");
        list.display();
    }
}