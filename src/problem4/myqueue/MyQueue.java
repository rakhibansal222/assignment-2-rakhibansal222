/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.node.Node;

public class MyQueue {
    // a field to refer rear end of queue
    private Node rear;
    // a field to refer front end of queue
    private Node front;
    private int size;// total number of elements in the queue

    // constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void storePreOrderSuccessor(MyBinarySearchTree tree){
        TreeNode root=tree.getRoot();
        storePreOrderSuccesssorRec(root);
    }

    // A recursive function to do preorder traversal of BST
    void storePreOrderSuccesssorRec(TreeNode root) {
        if (root != null) {
            enqueue(root.getData());
            storePreOrderSuccesssorRec(root.getLeft());
            storePreOrderSuccesssorRec(root.getRight());
        }
    }


    // a method to check whether queue is empty
    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }


    // a method to add a new element in queue
    public void enqueue(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            rear = node;
            front = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }
