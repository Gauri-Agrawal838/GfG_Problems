//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

public class LRUDesign {

    private static List<String> inputLine(Scanner sc) {
        return Arrays.asList(sc.nextLine().split(" "));
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int capacity = Integer.parseInt(sc.nextLine());
            LRUCache cache = new LRUCache(capacity);

            int queries = Integer.parseInt(sc.nextLine());
            while (queries-- > 0) {
                List<String> vec = inputLine(sc);
                if (vec.get(0).equals("PUT")) {
                    int key = Integer.parseInt(vec.get(1));
                    int value = Integer.parseInt(vec.get(2));
                    cache.put(key, value);
                } else {
                    int key = Integer.parseInt(vec.get(1));
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// design the class in the most optimal way

class LRUCache {
    private final int capacity; // Capacity of the cache
    private final Map<Integer, Node> map; // HashMap to store key and corresponding Node
    private final DoublyLinkedList dll; // Doubly Linked List to maintain LRU order

    // Constructor for initializing the cache capacity
    public LRUCache(int cap) {
        this.capacity = cap;
        this.map = new HashMap<>();
        this.dll = new DoublyLinkedList();
    }

    // Function to return value corresponding to the key
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1; // Key not found
        }
        // Move the accessed node to the front of the list
        Node node = map.get(key);
        dll.moveToFront(node);
        return node.value;
    }

    // Function for storing key-value pair
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Update the value and move the node to the front
            Node node = map.get(key);
            node.value = value;
            dll.moveToFront(node);
        } else {
            // Check if the cache is full
            if (map.size() == capacity) {
                // Remove the least recently used item (from the tail)
                Node lru = dll.removeTail();
                map.remove(lru.key);
            }
            // Add the new key-value pair
            Node newNode = new Node(key, value);
            dll.addToFront(newNode);
            map.put(key, newNode);
        }
    }

    // Doubly Linked List Node
    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Doubly Linked List to manage the order of elements
    private static class DoublyLinkedList {
        private final Node head;
        private final Node tail;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        // Add a node to the front of the list
        void addToFront(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        // Move an existing node to the front of the list
        void moveToFront(Node node) {
            remove(node);
            addToFront(node);
        }

        // Remove a node from the list
        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        // Remove the node at the tail
        Node removeTail() {
            Node lru = tail.prev;
            remove(lru);
            return lru;
        }
    }
}
