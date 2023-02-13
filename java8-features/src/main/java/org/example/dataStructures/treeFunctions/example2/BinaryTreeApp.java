package org.example.dataStructures.treeFunctions.example2;

public class BinaryTreeApp {


    public static void main(String[] args) throws Exception {
        // construct the binary tree given in question
        BinaryTree bt = BinaryTree.create();

        // traversing binary tree using InOrder traversal using recursion
        System.out .println("printing nodes of binary tree on InOrder using recursion");
        bt.inOrder();
    }
}
