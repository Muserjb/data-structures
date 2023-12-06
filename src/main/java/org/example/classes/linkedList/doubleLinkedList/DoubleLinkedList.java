package org.example.classes.linkedList.doubleLinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;


    public DoubleLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head: "+ head.value);
    }
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+ length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if ( head == null && tail == null ){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.pre = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        Node temp = tail;
        if ( head == null && tail == null){
            return null;
        }else if ( head == tail ){
            head = null;
            tail = null;
        }else {
            temp = tail;
            tail = tail.pre;
            tail.next = null;
            temp.pre = null;
            length--;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if ( head == null || tail == null ){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if ( head == null && tail == null ){
            return null;
        } else if ( head == tail ){
            head = null;
            tail = null;
        }else {
            temp = head;
            head = head.next;
            head.pre = null;
            temp.next = null;
        }
        length --;
        return temp;
    }
    public Node getNode(int index){
        if ( index < 0 || index >= length ) {
            return  null;
        }
        Node temp = head;
        if ( index < length/2 ){
            for (int i = 0; i < index; i++) {
                temp = head.next;
            }
        }else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = tail.pre;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = getNode(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if ( index < 0 || index >= length ){
            return false;
        }
        if ( index == 0 ){
            prepend(value);
            return true;
        }
        if ( index == length ){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = getNode(index - 1);
        Node after = before.next;
        before.next = newNode;
        after.pre = newNode;
        newNode.next = after;
        newNode.pre = before;
        length++;
        return true;
    }
    public Node remove(int index){
        if ( index < 0 || index >= length){
            return null;
        }
        if ( index == length - 1){
           return removeLast();
        }
        if ( index == 0 ) {
            return removeFirst();
        }
        Node temp = getNode(index);

        Node before = temp.pre;
        Node after = temp.next;

        before.next = temp.next;
        after.pre = temp.pre;
        temp.pre = null;
        temp.next = null;
        length--;
        return temp;


    }


}
