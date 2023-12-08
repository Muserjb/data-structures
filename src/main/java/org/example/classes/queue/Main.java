package org.example.classes.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(7);

        myQueue.getFirst();
        myQueue.enqueue(10);
        myQueue.getLast();

        myQueue.getLength();
        System.out.println(myQueue.dequeue().value);

        myQueue.printQueue();
    }
}
