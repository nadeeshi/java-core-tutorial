package org.example.dataStructures.treeFunctions.example2;

import java.util.Stack;

/**
 * The InOrder traversal is one of the three popular ways to traverse a binary tree data structure,
 * the other two being the preOrder and postOrder.
 *
 * During the in-order traversal algorithm, the left subtree is explored first, followed by root, and finally nodes on the right subtree.
 * You start traversal from root then go to the left node, then again go to the left node until you reach a leaf node.
 * At that point in time, you print the value of the node or mark it visited and move to the right subtree.
 * Continuing the same algorithm until all nodes of the binary tree are visited.
 * The InOrder traversal is also known as the left-node-right or left-root-right traversal or LNR traversal algorithm.
 *
 *
 *
 */
public class BinaryTree {

    // root of binary tree
    TreeNode root;

    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(Integer value) {
            this.data = value;
            left = right = null;
        }
    }

    /**
     * traverse the binary tree on InOrder traversal algorithm
     * using recursion
     * binary tree is a recursive data structure, recursion is the natural choice for solving a tree-based problem
     *
     * InOrder traversal is extremely important because it also prints nodes of a binary search tree in the sorted order but only if the given tree is a binary search tree.
     * If you remember, in BST,
     *  the value of nodes in the left subtree is lower than the root,
     *  and the values of nodes on the right subtree are higher than the root.
     *
     *  The In order traversal literally means IN order i.e notes are printed in the order or sorted order.
     *
     *
     */
    public void inOrder() {
        inOrderWithRecursion(root);
    }

    private void inOrderWithRecursion(TreeNode node) {
        if (node == null) { // we are going down on the left subtree until last node was a leaf node
            return;
        }

        inOrderWithRecursion(node.left); // visit left node
        System.out.printf("%s ", node.data); // print value of the root
        inOrderWithRecursion(node.right); // visit right node
    }

    /**
     * We start with the root and process until current node is not or Stack is not empty.
     *
     */
    public void inOrderWithoutRecursion() {
        Stack nodes = new Stack<>(); // Creating an empty Stack
        TreeNode current = root;

        // We start with the root and process until current node is not or Stack is not empty.
        while (!nodes.isEmpty() || current != null) {
            if (current != null) {
                nodes.push(current); // inserting an element into stack
                current = current.left;
            } else {
                TreeNode node = (TreeNode) nodes.pop(); // removing the top element from the stack
                System.out.printf("%s ", node.data);
                current = node.right;
            }
        }
    }

    // Preorder traversal
    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(TreeNode node)
    {
        if(node != null){
            System.out.printf("%s ", node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    // Postorder traversal
    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(TreeNode node)
    {
        if(node != null)
        {
            postOrder(node.left);
            postOrder(node.right);
            System.out.printf("%s ", node.data);
        }
    }

    public void insert(int key)
    {
        root = insert(root, key);
    }

    /**
     * Inserting node - recursive method to binary tree
     * @param node
     * @param value
     * @return
     */
    public TreeNode insert(TreeNode node, int value)
    {
        if (node == null) {
            return new TreeNode(value);
        }

        // Move to the left if passed value is less than the current node
        if (value < node.data) {
            node.left = insert(node.left, value);
        }

        // Move to the right if passed value is greater than the current node
        else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    /**
     * Search/find node in binary search tree
     */
    public TreeNode searching(int searchedValue) {
        TreeNode current = root;
        while (current.data != searchedValue) {
            if (searchedValue < current.data)
                // Move to the left if searched value is less
                current = current.left;
            else
                // Move to the right if searched value is >=
                current = current.right;

            if (current == null) {
                return null;
            }

        }
        return current;
    }

    public static BinaryTree create() {
        BinaryTree tree = new BinaryTree();

        TreeNode root = new TreeNode(40);
        tree.root = root;
        tree.root.left = new TreeNode(20);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.left.left = new TreeNode(5);
        tree.root.left.right = new TreeNode(30);

        tree.root.right = new TreeNode(50);
        tree.root.right.right = new TreeNode(60);
        tree.root.left.right.left = new TreeNode(67);
        tree.root.left.right.right = new TreeNode(78);

        return tree;
    }
}
