package datastructure;

public class LinkedList {
    private Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        // Display add
        System.out.print("After adding: ");
        list.display();
    }

    public void add(int data) {
        // 1. Create a new node with given data
        Node newNode = new Node(data);

        // 2. If the list is empty (no head yet), make this node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // 3. Otherwise, start from head and find the last node
        Node currentNode = head;
        while (currentNode.next != null) { // Check & move the node one by one to the right
            currentNode = currentNode.next; // It will stop until next node is null
        }

        // 4. If the next node is null, then assign it
        currentNode.next = newNode;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void update(int index, int newValue) {
        Node currentNode = head;

        int count = 0;

        while (currentNode != null) {
            if (count == index) {
                currentNode.data = newValue;
                return;
            }

            count++;
            currentNode = currentNode.next;
        }
    }

    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            if (currentNode.next.data == value) {
                currentNode.next = currentNode.next.next;
                return;
            }

            currentNode = currentNode.next;
        }
    }
}

class Node {
    // 1. Declare a node that consists of two parts: Data, Pointer
    int data;
    Node next;

    // 2. Declare a constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
