package org.example.classes.linkedList.doubleLinkedList;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(2);


        doubleLinkedList.getHead();
        doubleLinkedList.getTail();
        doubleLinkedList.printList();


        //Double Linked List
        doubleLinkedList.append(3);
        doubleLinkedList.append(4);
        doubleLinkedList.prepend(1);
        doubleLinkedList.getHead();
        doubleLinkedList.getTail();
        Node node = doubleLinkedList.removeLast();
        System.out.println(node.value);
        doubleLinkedList.printList();



        //Double Linked List
        doubleLinkedList.append(3);
        doubleLinkedList.append(4);
        doubleLinkedList.prepend(1);

        int get = doubleLinkedList.getNode(2).value;
        doubleLinkedList.set(12, 2034);

        doubleLinkedList.insert(2, 123456);

        doubleLinkedList.remove(2);
        doubleLinkedList.printList();
    }
}
