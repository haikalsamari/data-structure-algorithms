package datastructure;

public class LinkedList {
    private Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("After adding: ");
        list.display();

        // Update
        list.update(1, 50);
        System.out.print("After updating: ");
        list.display();

        // Delete
        list.delete(30);
        System.out.print("After deleting: ");
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
        // 1. Set current node as the head
        Node current = head;

        // 2. If current node is not null, then print current data
        // and re-set the current node to the next node
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void update(int index, int newValue) {
        // 1. Set current node as the head
        Node currentNode = head;

        // 2. Initialize count to track the index
        int count = 0;

        // 3. If current node is not null,
        // then check if current count equals to current node's index
        // if matches, then set current node's data to new value
        // and breaks
        while (currentNode != null) {
            if (count == index) {
                currentNode.data = newValue;
                return;
            }

            // Increase if current count not equals to index
            count++;
            // Set current node to the next node
            currentNode = currentNode.next;
        }
    }

    public void delete(int value) {
        // 1. Check if head is null
        if (head == null) return;

        // 2. Check if head's data matches the value to be deleted
        // if yes, set the head to next node
        if (head.data == value) {
            head = head.next;
            return;
        }

        // 3. Set head as current node
        Node currentNode = head;

        // 4. Check if next node is null,
        // then check if next node's data matches the value
        // if yes, re-set the next node to its next node
        while (currentNode.next != null) {
            if (currentNode.next.data == value) {
                currentNode.next = currentNode.next.next;
                return;
            }

            // if not matches, then set to next node
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
