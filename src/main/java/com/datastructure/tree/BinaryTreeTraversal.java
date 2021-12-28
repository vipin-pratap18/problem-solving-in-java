package com.datastructure.tree;

/**
 * @author : VipinK
 */
public class BinaryTreeTraversal {

    //Time complexity for all three would be O(n) as all the elements are visited for traversal
    //Worst case the stack size can grow upto the height of the tree

    public void preorder(BinaryTreeNode root){
        if(root == null){
            System.out.println("Root node is null");
        }

        //Pre-order
        //Root, Left, Right
        System.out.println("Root element visited value is : " + root.getValue());
        preorder(root.getLeftNode());
        preorder(root.getRightNode());
    }


    public void inorder(BinaryTreeNode root){
        if(root == null){
            System.out.println("Root node is null");
        }

        //in-order
        //Left, Root, Right
        inorder(root.getLeftNode());
        System.out.println("Root element visited value is : " + root.getValue());
        inorder(root.getRightNode());
    }


    public void postorder(BinaryTreeNode root){
        if(root == null){
            System.out.println("Root node is null");
        }

        //Post-order
        //Left, Right, Root
        postorder(root.getLeftNode());
        postorder(root.getRightNode());
        System.out.println("Root element visited value is : " + root.getValue());
    }
}
