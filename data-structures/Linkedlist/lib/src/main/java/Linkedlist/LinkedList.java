package Linkedlist;
import data.Nodes;

public class LinkedList {
    private Nodes head = null;

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



