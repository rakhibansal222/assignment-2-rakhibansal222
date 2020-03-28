/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

import java.awt.desktop.AppReopenedEvent;

public class MyPriorityQueue {
    // a field to refer rear end of queue
    private Node rear;
    // a field to refer front end of queue
    private Node front;
    private int size;// total number of elements in the queue

    // constructor
    public MyPriorityQueue() {
        front = null;
        rear = null;
        size = 0;
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
    public void enqueue(Student element) {
        Node node = new Node(element);
        Node temp=front;
        Node previous=temp;
        if (isEmpty()) {
            rear = node;
            front = node;
            size++;
        }
        else {
            while(temp.getStudent().getRollNo()<element.getRollNo()&&temp!=null){
                previous=temp;
                temp=temp.getNext();
            }
            if(previous==front&&temp==front){
                node.setNext(front);
                front=node;
            }
            else {
                previous.setNext(node);
                node.setNext(temp);
            }

            if(temp==null){
                rear=node;
            }
            size++;
        }
//        if (isEmpty()) {
//            rear = node;
//            front = node;
//            size++;
//        } else {
//            rear.setNext(node);
//            rear = node;
//            size++;
//        }
        //sortQueue();
    }
    

    public Node poll(){
        Node res = null;
        if(!isEmpty()) {
            if(front.getNext()!=null) {
                res = front;
                front = front.getNext();
                res.setNext(null);
                size--;
            }
            else {
                res=front;
                //res.getNext(null);//redundant
                front=null;
                rear=null;
                size--;
            }
        }
        else {
            System.out.println("Queue UnderFlow");
        }
        return res;

    }

    // a method to get front element without removing it
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = new Node(front.getStudent());
        }
        return response;
    }


    public void display(){
        System.out.print("Display : ");
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.getStudent());
            if(temp.getNext()!=null){
                System.out.print("<---");
            }
            temp=temp.getNext();
        }
        System.out.println();
    }

    // a method to get size of queue
    public int getSize() {
        return size;
    }

    public Node rear(){
        return rear;
    }
}
