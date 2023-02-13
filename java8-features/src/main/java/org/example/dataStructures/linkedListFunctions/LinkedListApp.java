package org.example.dataStructures.linkedListFunctions;

/**
 * A linked list may be defined as a linear data structure which can store a collection of items.
 * In another way, the linked list can be utilized to store various objects of similar types.
 * Each element or unit of the list is indicated as a node. Each node contains its data and the address of the next node.
 * It is similar to a chain. Linked lists are used to create graphs and trees.
 *
 * Each node available in a list is made up of two items-the data itself and a reference (also known as a link) to the next node in the sequence.
 * The last node includes a reference to null. The starting point into a linked list is known as the head of the list.
 * It should be noted that the head is a reference to the first node, not a separate node.
 * The head is considered as a null reference if the list is empty.
 *
 * Dynamic memory allocation is referred for Linked List.
 *
 * Singly Linked List - The singly linked list includes nodes which contain a data field and next field.
 *                      The next field further points to the next node in the line of nodes.
 * Doubly Linked List - The doubly linked list includes a pointer (link) to the next node as well as to the previous node in the list.
 *                      The two links between the nodes may be called "forward" and "backward, "or "next" and "prev (previous)."
 * Multiply Linked List
 * Circular Linked List - In the last node of a linked list, the link field often contains a null reference.
 *                      Instead of including a null pointer at the end of the list, the last node in circular linked lists includes a pointer pointing to the first node.
 */
public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert values at lats to the single LinkedList
        linkedList = linkedList.insertDataAtLast(linkedList, 10);
        linkedList = linkedList.insertDataAtLast(linkedList, 20);
        linkedList = linkedList.insertDataAtLast(linkedList, 30);
        linkedList = linkedList.insertDataAtLast(linkedList, 40);
        linkedList = linkedList.insertDataAtLast(linkedList, 50);

        System.out.println("LinkedList is created: ");
        linkedList.printData(linkedList);

        // Insert values at front to the single LinkedList
        linkedList = linkedList.insertDataAtFront(linkedList, 10);
        linkedList = linkedList.insertDataAtFront(linkedList, 70);
        linkedList.printData(linkedList);

        linkedList = linkedList.deleteByKey(linkedList, 1);
        linkedList = linkedList.deleteByKey(linkedList, 20);

        System.out.println("After removing some keys from LinkedList: ");
        linkedList.printData(linkedList);
    }
}
