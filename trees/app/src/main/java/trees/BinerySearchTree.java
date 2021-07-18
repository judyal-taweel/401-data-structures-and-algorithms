package trees;

import Data.Node;

public class BinerySearchTree extends BineryTree {

    private Node root;

//    public void isEmpty(){
//        if (root == null){
//            System.out.println("the tree is empty");
//        }
//    }


    public void add(int key){
        if(root == null){
            root= new Node(key);
        }else{
            Node current= root;
                traversal(current,key);
            }
        }

    public int getRootKey(){
        return root.getKey();
    }

    public int getRight(){
        return getRight();
    }
    public int getLeft(){
        return getLeft();
    }





    public void traversal(Node current,int key){
        if(key>current.getKey()) {
            if (current.getRight()==null){
                current.setRight(new Node(key));
                return;
            }
            current=current.getRight();
        }else{
            if(current.getLeft()==null){
            current.setLeft(new Node(key));
            return;

        }
            current=current.getLeft();
        }
        traversal(current,key);
}


    public boolean contains(int key){
        Node current = root;
        current = searchBT(current,key);
        if(current!=null)
            return true;
        else
            return false;
    }

public  Node searchBT(Node current,int key){
        if(current==null|| current.getKey()==key)
            return current;
        if (current.getKey()>key)
            return searchBT(current.getLeft(),key);

        return searchBT(current.getRight(),key);
}
}


