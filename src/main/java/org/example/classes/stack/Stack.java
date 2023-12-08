package org.example.classes.stack;



public class Stack {
    Node top;
    int height;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;

    }

    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println("element: "+temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top: "+ top.value);
    }

    public void getHeight(){
        System.out.println("Height: "+ height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if ( height == 0 ) {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        if ( height == 0 ){
            return null;
        }
        Node temp = top;
        top = top.next;
        temp = null;
        height--;
        return temp;
    }
}