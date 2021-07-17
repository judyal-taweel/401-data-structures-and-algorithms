package stackAndQueue;

import Data.Node;

public class Stack<T> {
    Node head;
    int size = 0;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void push(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            size++;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            size++;
        }
    }

    public T peek() {
        return (T) head.getData();
    }

    public Object pop() {

        if (isEmpty()) {
            System.out.println("is empty");
        } else {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            size--;
        }
        return null;
    }

    public void tostring() {
        while (size != 0) {
            System.out.print("{" + peek() + "} ->");
            pop();
        }
        System.out.print("Null");
        System.out.println();

    }
}