package org.example.dataStructures.treeFunctions.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {

    //To store in-order values for testing purpose
    private List<String> list = new ArrayList<>();

    /**
     * traverse the binary tree in-order
     * @param node
     */
    public void printInOrder(Node node) {
        if(node == null) {
            return; // terminate the recursion and will execute print statement
        }

        printInOrder(node.getLeft());
        System.out.print(node.getKey() + ", ");
        list.add(node.getKey());

        printInOrder(node.getRight());
    }

    /**
     * traverse tree in-order without recursion, iterative algorithm
     */
    public void inOrderWithoutRecursion(Node current) {
        Stack<Object> nodes = new Stack<>(); // Stack to convert the recursive in order algorithm to an iterative one

        // We start with the root and process until current node is not or Stack is not empty.
        while (!nodes.isEmpty() || current != null) {
            if (current != null) {
                nodes.push(current);
                current = current.getLeft();
            } else {
                NodeImpl node = (NodeImpl) nodes.pop();
                System.out.print(node.getKey() + ", ");
                list.add(node.getKey());
                current = node.getRight();
            }
        }
    }

    public List<String> getList() {
        return list;
    }

}
