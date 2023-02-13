package org.example.dataStructures.treeFunctions.example1;

public class NodeImpl implements Node {

    private String key;

    private NodeImpl left;

    private NodeImpl right;

    public NodeImpl(String key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public NodeImpl getLeft() {
        return this.left;
    }

    @Override
    public NodeImpl getRight() {
        return this.right;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setLeft(NodeImpl left) {
        this.left = left;
    }

    public void setRight(NodeImpl right) {
        this.right = right;
    }
}
