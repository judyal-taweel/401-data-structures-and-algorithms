package stack.and.queue;

import data.Node;

public class Stack<T> {
    Node head;
    int size=0;

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    public void push(T data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head=newNode;
            size++;
        }else{
            Node temp=head;
            newNode.next=temp;
            head=newNode;
            size++;
        }
    }

    public T getTop(){
        return (T) head.getData();
    }

    public void pop(){

        if(isEmpty()) {
            System.out.println("is empty");
        }else{
            Node temp=head;
            head= head.getNext();
            temp.setNext(null);
            size--;
        }
    }

    public void tostring(){
        while(size!=0){
            System.out.print("{"+getTop()+"} ->");
            pop();
        }
        System.out.print("Null");
        System.out.println();

    }
}
