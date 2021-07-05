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

    public int returnNum (int k){
        int len = 0;
        Nodes curr =this.head;
        while (curr!= null) {
            curr= curr.getNext();
            len++;
        }
        if (len < k){
            return -1 ;
        }else if (k<0){
        return 0;
        }
        curr=this.head;
        for (int i = 1; i < len - k + 1; i++)
            curr= curr.getNext();
        return curr.getData();
    }

}



