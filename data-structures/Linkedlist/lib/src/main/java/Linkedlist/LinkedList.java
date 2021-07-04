package Linkedlist;
import data.Nodes;

public class LinkedList {
    private Nodes head = null;

    public void append(int value){
        Nodes node=new Nodes(value);
        if(this.head == null){
            this.head=node;
        }else{
            Nodes curr=this.head;
            while (curr.getNext() != null){
                curr=curr.getNext();
            }
            curr.setNext(node);
        }
    }

    public void insertBefore(int ref, int value){
        Nodes curr = this.head;
        while (curr.getNext() != null){
            if (curr.getNext().getData() == ref){
                Nodes node = new Nodes(value);
                node.setNext(curr.getNext());
                curr.setNext(node);
            }
            curr=curr.getNext();
        }

    }

    public void insertAfter(int ref , int value){
        Nodes curr = this.head;
        while (curr != null){
            if (curr.getNext().getData() == ref){
                Nodes node = new Nodes(value);
                curr.setNext(node.getNext());
                curr.setNext(node);
            }
            curr=curr.getNext();
        }

    }

    public void insert(int value){
        Nodes node = new Nodes(value);
        if(this.head==null) {
            this.head=node;
        }else{
            Nodes current = this.head;
            node.setNext(current);
            this.head=node;
        }
    }
    public boolean include(int value){
        Nodes current = this.head;
        while (current.getNext() != null){
            if(current.getData() == value){
                return true;
            }
            current=current.getNext();
        }
        return false;
    }
    @Override
    public String toString(){
      String result = "";
      Nodes current = this.head;
      while (current != null) {
          result += "{" + current.getData() + "} ->";
          current = current.getNext();
      }
        result +="Null";
      return result;

    }

}



