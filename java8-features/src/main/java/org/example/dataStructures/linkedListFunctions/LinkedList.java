package org.example.dataStructures.linkedListFunctions;

/**
 * Like arrays, Linked List is a linear data structure.
 * Unlike arrays, linked list elements are not stored at the contiguous location, the elements are linked using pointers
 *
 * In Java, LinkedList can be represented as a class and a Node as a separate class.
 * The LinkedList class contains a reference of Node class type.
 *
 * This class is represented for implement for a Singly Linked List
 */
public class LinkedList {

    // Head of list
    private Node head;

    // Singly Linked list Node
    public static class Node {
        private int data;
        private Node next;


        // Constructor to create a new node
        // Next is by default initialized as null
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    public Node getHead() {
        return head;
    }

    /**
     * insertion in the list is done at the end, that is the new node is added after the last node of the given Linked List.
     * For example, if the given Linked List is 5->10->15->20->25 and 30 is to be inserted, then the Linked List becomes 5->10->15->20->25->30.
     * Since a Linked List is typically represented by the head pointer of it,
     * it is required to traverse the list till the last node and then change the next to last node to the new node.
     * Complexity O(n)
     * @param linkedList
     * @param data
     * @return
     */
    public LinkedList insertDataAtLast(LinkedList linkedList, int data) {
        Node newNode = new Node(data); // Create a new node with given data
        newNode.next = null;

        // If the Linked List is empty, then make the new node as head
        if (linkedList.head == null) {
            linkedList.head = newNode;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node last = linkedList.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode; // Insert the new_node at last node
        }

        return linkedList; // Return the list by head
    }

    /**
     * Insertion in the list is done at the front, complexity O(1)
     * @param linkedList
     * @param data
     * @return
     */
    public LinkedList insertDataAtFront(LinkedList linkedList, int data) {
        Node newNode = new Node(data); // Create a new node with given data

        newNode.next = head; // insert it at the first position

        head = newNode; // update head to point to this new node

        return linkedList;
    }


    /**
     * Delete by Key: Given a ‘key’, delete the first occurrence of this key in the linked list.
     * @param linkedList
     * @param key
     * @return
     */
    public LinkedList deleteByKey(LinkedList linkedList, int key) {
        Node currentNode = linkedList.head; // Store head node
        Node previousNode = null;

        // CASE 1: If head node itself holds the key to be deleted
        if(currentNode != null && currentNode.data == key) {
            linkedList.head = currentNode.next; // Changed head
            System.out.println(key + " : key found and deleted");
            return linkedList;
        }

        // CASE 2: If the key is somewhere other than at head
        // Search for the key to be deleted, keep track of the previous node as it is needed to change currNode.next
        while (currentNode != null && currentNode.data != key) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        // If the key was present, it should be at currNode, Therefore the currNode shall not be null
        // Then Since the key is at currNode, Unlink currNode from linked list
        if(currentNode != null) {
            previousNode.next = currentNode.next;
            System.out.println(key + " : key found and deleted");
        }

        // CASE 3: The key is not present
        // If key was not present in linked list currNode should be null
        if (currentNode == null) {
            System.out.println(key + " : key is not found");
        }

        return linkedList;
    }

    /**
     * Method to print the LinkedList
     * @param linkedList
     */
    public static void printData(LinkedList linkedList) {
        Node currentNode = linkedList.head;

        System.out.println("LinkedList: ");
        // Traverse through the LinkedList
        while (currentNode != null) {
            System.out.print(currentNode.data + " "); // Print current node
            currentNode = currentNode.next; // Go to next node
        }

        System.out.println("\n");
    }
}
