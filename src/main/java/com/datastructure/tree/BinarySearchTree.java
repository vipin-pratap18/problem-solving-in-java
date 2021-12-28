package com.datastructure.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : VipinK
 */
public class BinarySearchTree {

    //BST: All the left child will be less than root and all the right child will be greater than root
    //node value


    //BST search algorithm
    //BST time complexity for search is O(logn) but for skewwed BST it is O(n)
    public BinaryTreeNode search(BinaryTreeNode root, int key){
        if(root == null){
            return null;
        }
        if(key == root.getValue()){
            return root;
        }else if(key > root.getValue()){
            return search(root.getRightNode(), key);
        }else{
            return search(root.getLeftNode(), key);
        }
    }


    //BST insertion algorithm, iterative approach
    //BST time complexity for insertion is O(logn) but for skewwed BST it is O(n)
    public BinaryTreeNode insertIterative(BinaryTreeNode root, int data){
        BinaryTreeNode node = new BinaryTreeNode(data);
        if(root == null){
            return node;
        }
        BinaryTreeNode parent = null, current = root;
        while(current != null){
            parent = current;
            if(data >= current.getValue()){
                current = current.getRightNode();
            }else{
                current = current.getLeftNode();
            }
        }

        if(data >= parent.getValue()){
            parent.setRightNode(node);
        }else{
            parent.setLeftNode(node);
        }

        return root;
    }


    //Checking if two given trees are same, time complexity to execute this solution would be O(n)
    //because each and every node is traversed and compared
    public boolean sameTree(BinaryTreeNode root1, BinaryTreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }

        return root1.getValue() == root2.getValue() &&
                sameTree(root1.getLeftNode(), root2.getLeftNode()) &&
                sameTree(root1.getRightNode(), root2.getRightNode());
    }


    //Size of binary tree, where it return the number of elements in the binary tree
    //Time complexity is O(n)
    public int sizeofBinaryTree(BinaryTreeNode root){
        if(root == null){
            return 0;
        }

        int leftSize = sizeofBinaryTree(root.getLeftNode());
        int rightSize = sizeofBinaryTree(root.getRightNode());
        return leftSize + rightSize + 1;
    }


    //Height of binary tree
    //Time complexity is O(n)
    //Space complexity = height of binary tree e.g. O(n)
    public int heightofBinaryTree(BinaryTreeNode root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightofBinaryTree(root.getLeftNode());
        int rightHeight = heightofBinaryTree(root.getRightNode());
        return 1 + Math.max(leftHeight, rightHeight);
    }


    //Root to leaf node path find which sums to the given sum value
    //Given solution will take O(n) time as every node will be visited for finding the desired path in worst case
    public boolean rootToLeafSum(BinaryTreeNode root, int sum, List<Integer> result){
        if(root == null){
            return false;
        }
        if(root.getLeftNode() == null && root.getRightNode() == null){
            if(root.getValue() == sum){
                result.add(root.getValue());
                return true;
            }else{
                return false;
            }
        }

        if(rootToLeafSum(root.getLeftNode(), sum - root.getValue(), result)){
            result.add(root.getValue());
            return true;
        }

        if(rootToLeafSum(root.getRightNode(), sum - root.getValue(), result)){
            result.add(root.getValue());
            return true;
        }

        return false;
    }


    //Finding out if a given tree is a BST or not
    //This solution will take O(n) time as it is visiting each and every node for checking the BST conditions
    //max and min initially will contain the Integer.MIN and Integer.MAX, as these supposed to be -infinite to +infinite
    public boolean isBST(BinaryTreeNode root, int min, int max){

        if(root == null){
            return true;
        }
        if(root.getValue() <= min || root.getValue() > max){
            return false;
        }

        return isBST(root.getLeftNode(), min, root.getValue()) &&
                isBST(root.getRightNode(), root.getValue(), max);
    }


    //Level order traversal will traverse all the elements at the same level using queue
    //Time complexity is O(n) and space complexity is O(n/2) == O(n)
    public void levelOrderTraversal(BinaryTreeNode root){
        if(root == null){
            return;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            root = queue.poll();
            System.out.println(root.getValue());
            if(root.getLeftNode() != null){
                queue.add(root.getLeftNode());
            }

            if(root.getRightNode() != null){
                queue.add(root.getRightNode());
            }
        }
    }
}
