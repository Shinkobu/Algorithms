package ru.geekbrains.lesson3;

public class Sample02 {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);

        Node head = myLinkedList.getHead();
        System.out.println(myLinkedList.toString());

        System.out.println(ReverseLinkedList(myLinkedList).toString());

    }

    public static MyLinkedList ReverseLinkedList(MyLinkedList myLL) {
        MyLinkedList myReversedLL = new MyLinkedList();
        /*
        Пример из 3 элементов:
        Берём 1 ноду. Запоминаем некст, делаем ласт
        Берём 2 ноду. Запоминаем некст, делаем указатель на ласт
        Берём 3 ноду. Некста нет. Тогда делаем указатель и делаем хэд
         */

        Node someNode = myLL.getHead();
        Node lastNode = someNode;
        myReversedLL.addFirst(someNode.getValue());

        while (someNode.getNext() != null){
            someNode = someNode.getNext();
            myReversedLL.addFirst(someNode.getValue());
        }
        return myReversedLL;
    }

    public static Node middleNode(Node head){
        int lenght = 1;
        Node node = head;

        while (node.getNext() != null){
            lenght++;
            node = node.getNext();
        }

        lenght = lenght / 2 + 1;

        node = head;

        for (int i = 0; i < lenght - 1; i++){
            node = node.getNext();
        }

        return node;
    }



}
