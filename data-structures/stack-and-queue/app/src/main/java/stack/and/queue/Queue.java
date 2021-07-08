package stack.and.queue;

import data.Node;

public class Queue<T> {
    Node front;
    Node rear;
    int size = 0;

    public boolean isEmpty(){
        if(front==null){
            return true;
        }
        return false;
    }

    public void enQueue(T data){
        Node node=new Node(data);
        if(isEmpty()){
            front=node;
            rear=node;
            size++;
        }else{
            Node temp=rear;
            rear=node;
            temp.setNext(node);
            size++;
        }
    }

    public T peek(){
        return (T) front.getData();
    }

    public void deQueue(){
        if (isEmpty()){
            System.out.println("is empty");
        }else {
            Node temp=front;
            front=front.getNext();
            temp.setNext(null);
            size--;
        }
    }

    public void tostring(){
        while(size!=0){
            System.out.print("{"+peek()+"} ->");
            deQueue();
        }
        System.out.print("Null");
        System.out.println();

    }
}
