package com.company.leetcode;

public class LinkedList {
    Node head;
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEnd(10);
        list.insertEnd(11);
        list.insertEnd(12);
        list.insertEnd(13);
//         list.insert(10);
//         list.insert(11);
//         list.insert(12);
//         list.insertAtIndex(13,1);
        Node head1 = list.reverseLinkedList(list.head);
        list.printList(head1);
    }
    public void insertEnd(int data){
        Node node = new Node(data);
        Node temp = head;
        if(head==null){
            head = node;
            return;
        }
        while (temp!=null&&temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }
    public void insert(int data){
           Node newNode =  new Node(data);
           newNode.next = head;
           head = newNode;
    }
    public void insertAtIndex(int data,int index){
        Node newNode =  new Node(data);
        Node temp = head;
        Node prev = null;
        int i=1;
        while (temp!=null){
            if(i==1){
                insert(data);
                break;
            }
            if(i==index){
                prev.next=newNode;
                newNode.next=temp;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
    }
    public Node reverseLinkedList(Node node){
        if(node.next==null){
            return node;
        }
        Node headNode = reverseLinkedList(node.next);
        node.next.next = node;
        node.next=null;
        return headNode;
    }

    public void printList(Node node){
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
