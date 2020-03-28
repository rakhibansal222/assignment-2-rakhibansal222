/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

// executable class
// use problem5.student.Student class to create object of student

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(42,"Rakhi"));queue.display();
        //System.out.println(queue.getSize());
        //System.out.println(queue.peek().getStudent() + " element at front");
        queue.enqueue(new Student(2,"Ayushi"));queue.display();
        queue.enqueue(new Student(3,"Mansi"));queue.display();
        queue.enqueue(new Student(5,"Muskan"));queue.display();
        queue.enqueue(new Student(1,"Ekta"));queue.display();
        queue.enqueue(new Student(6,"Vishal"));queue.display();
        queue.enqueue(new Student(4,"Anya"));queue.display();
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println(queue.poll().getStudent() + " polled");queue.display();
        //System.out.println(queue.rear().getStudent() + " is rear");
        System.out.println("The Size Queue is = " + queue.getSize());

    }
}
