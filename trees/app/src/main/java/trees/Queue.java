package trees;

import Data2.Node;

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

    public T dequeue() {

        if(this.front == null){
            System.out.println("The Queue is empty and the zero value indicates not the actual value");
            return null;
        }else{
            Node temp = this.front;
            this.front = this.front.next;
            return (T) temp.getData();
        }
    }

    public void tostring(){
        while(size!=0){
            System.out.print("{"+peek()+"} ->");
            dequeue();
        }
        System.out.print("Null");
        System.out.println();

    }
}
