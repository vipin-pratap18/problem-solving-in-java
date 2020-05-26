package com.examples.tree;

/**
 * @author : VipinK
 */
public class BinaryTreeNode {

    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;
    private int value;

    BinaryTreeNode(int value){
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
