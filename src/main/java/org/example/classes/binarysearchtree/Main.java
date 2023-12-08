package org.example.classes.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBinary = new BinarySearchTree();

        myBinary.insert(47);
        myBinary.insert(21);
        myBinary.insert(76);
        myBinary.insert(18);
        myBinary.insert(27);
        myBinary.insert(52);
        myBinary.insert(82);
        myBinary.insert(27);
        Node root = myBinary.root;

        System.out.println("Root: "+ root.value);

        boolean contains = myBinary.contains(17);
        System.out.println(contains);
        System.out.println(myBinary.root.left.right.value);
    }
}
