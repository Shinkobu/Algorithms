package ru.geekbrains.lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyLinkedList {

    private Node head; // Ссылка на первый элемент

    public Node getHead() {
        return head;
    }


    @Override
    public String toString() {
//        Node node = new Node(value);
        ArrayList <Integer> myArr = new ArrayList<Integer>(1);
        if (head == null){
            return null;
        }
        else {
            myArr.add(myArr.size(), head.getValue());
            Node last = head;
            while (last.getNext() != null){
                last = last.getNext();
                myArr.add(myArr.size(), last.getValue());
            }
//            last.setNext(node);
        }

        return myArr.toString();
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if (head != null)
            node.setNext(head);
        head = node;
    }

    public void removeFirst(){
        if (head != null)
            head = head.getNext();
    }


    public Node contains(int value){
        Node node = head;
        while (node != null){
            if (node.getValue() == value)
                return node;
            node = node.getNext();
        }
        return null;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
        }
        else {
            Node last = head;
            while (last.getNext() != null){
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

    public void removeLast(){
        if (head == null)
            return;

        Node node = head;

        while (node.getNext() != null){
            if (node.getNext().getNext() == null)
            {
                node.setNext(null);
                return;
            }
            node = node.getNext();
        }

        head = null;

    }


}
