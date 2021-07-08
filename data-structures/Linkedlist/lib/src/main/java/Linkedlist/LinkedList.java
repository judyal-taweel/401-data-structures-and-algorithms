package Linkedlist;
import data.Nodes;

import java.util.List;

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



    public int insert(int value){
        Nodes node = new Nodes(value);
        if(this.head==null) {
            this.head=node;
        }else{
            Nodes current = this.head;
            node.setNext(current);
            this.head=node;
        }
        return node.getData();
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


    public LinkedList mergeTwoLists(LinkedList l1, LinkedList l2){
        LinkedList l3 = new LinkedList();
        if(l1 == null && l2 ==null){
            return null;
        }else if(l1 == null || l2 ==null){
            return l1 ==null?l2:l1;
        }else{
            Nodes curr1 =l1.head;
            Nodes curr2 =l2.head;
            Nodes node1 = new Nodes(curr1.getData());
            Nodes node2 = new Nodes(curr2.getData());
            l3.head = node1;
            Nodes curr3 = l3.head;

            curr3.setNext(node2);
            curr3=curr3.getNext();

            System.out.println(curr1.getNext().getData());
           while (curr1.getNext()!=null || curr2.getNext() !=null) {
             if (curr1.getNext()!=null) {
                 curr1=curr1.getNext();
                 Nodes nodeList3 = new Nodes(curr1.getData());
                 curr3.setNext(nodeList3);
                 curr3 = curr3.getNext();
             }
             if (curr2.getNext()!=null){
                 curr2=curr2.getNext();
                 Nodes nodeList4 = new Nodes(curr2.getData());
                 curr3.setNext(nodeList4);
                 curr3 = curr3.getNext();
             }
           }
        }
        return l3;
    }
}



