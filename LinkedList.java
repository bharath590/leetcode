package com.company.leetcode;

public class LinkedList {
    Node head;

    /* Linked list Node*/
   static class Node {
        int data;
        Node next;
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
    }
    public void insert(int val){
       Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
}
