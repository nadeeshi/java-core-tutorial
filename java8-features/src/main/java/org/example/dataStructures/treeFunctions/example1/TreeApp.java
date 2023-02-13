package org.example.dataStructures.treeFunctions.example1;

public class TreeApp {

    public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree();

        NodeImpl node = new NodeImpl("1");
        NodeImpl nodeLeft = new NodeImpl("2");
        nodeLeft.setLeft(new NodeImpl("3"));
        nodeLeft.setRight(new NodeImpl("4"));
        node.setLeft(nodeLeft);

        NodeImpl nodeRight = new NodeImpl("5");
        node.setRight(nodeRight);

        System.out.print("Traverse tree in-order: ");
        binaryTree.printInOrder(node);

        System.out.println("\n");
        System.out.print("Traverse tree in-order without recursion: ");
        binaryTree.inOrderWithoutRecursion(node);
    }
}
