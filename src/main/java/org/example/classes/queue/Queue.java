package org.example.classes.queue;
public class Queue {
    private Node first;
    private Node last;
    int length;
    public Queue(int value){
        Node myQueue = new Node(value);
        first = myQueue;
        last = myQueue;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.println("Queue element: "+ temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First element: " + first.value);
    }
    public void getLast(){
        System.out.println("last element: " + last.value);
    }
    public void getLength(){
        System.out.println("Length:" + length);
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if ( length == 0 ){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }


    public Node dequeue(){
        Node temp = first;
        if ( length == 0 ){
            return null;
        }
        if ( length == 1 ){
            first = null;
            last = null;
            return temp;
        }else {
            first = temp.next;
            temp.next = null ;
        }
        length--;
        return temp;
    }
}
