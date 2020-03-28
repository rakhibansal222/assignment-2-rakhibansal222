/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;
//executable class
import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;
import java.util.Random;
public class MyMain {
    public static void main(String[] args) {
        Random rand=new Random();
        MyCircularQueue queue = new MyCircularQueue();
        System.out.println("Adding Students :\n---------------------------");
        queue.enqueue(new Student(1,"Rakhi",2,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(2,"Ayushi",4,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(3,"Muskan",3,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(4,"Honey",5,rand.nextInt(2)+1));queue.display();
        queue.enqueue(new Student(5,"ProfessorX",0,rand.nextInt(2)+1));queue.display();
        System.out.println("Processing Elements :\n---------------------------");
        while (queue.processStudents()!=false){
            //Processing Students Until Queue is empty
            //EveryProcess the student clears 1-2 backlogs
        }
        queue.display();
    }
}
