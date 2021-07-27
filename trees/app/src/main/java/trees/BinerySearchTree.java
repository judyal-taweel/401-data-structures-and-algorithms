package trees;

import Data.Node;

public class BinerySearchTree<T> extends BineryTree {

    private Node<T> root;

//    public void isEmpty(){
//        if (root == null){
//            System.out.println("the tree is empty");
//        }
//    }


//    public void add(int key){
//        if(root == null){
//            root= new Node<T>(key);
//        }else{
//            Node<T> current= root;
//                traversal(current,key);
//            }
//        }

//    public int getRootKey(){
//        return root.getKey();
//    }
//
//    public int getRight(){
//        return getRight();
//    }
//    public int getLeft(){
//        return getLeft();
//    }
//
//    public void traversal(Node<T> current, int key){
//        if(key>current.getKey()) {
//            if (current.getRight()==null){
//                current.setRight(new Node<T>(key));
//                return;
//            }
//            current=current.getRight();
//        }else{
//            if(current.getLeft()==null){
//            current.setLeft(new Node<T>(key));
//            return;
//
//        }
//            current=current.getLeft();
//        }
//        traversal(current,key);
//}
//
//
//    public boolean contains(int key){
//        Node<T> current = root;
//        current = searchBT(current,key);
//        if(current!=null)
//            return true;
//        else
//            return false;
//    }
//
//public  Node<T> searchBT(Node<T> current, int key){
//        if(current==null|| current.getKey()==key)
//            return current;
//        if (current.getKey()>key)
//            return searchBT(current.getLeft(),key);
//
//        return searchBT(current.getRight(),key);
//}
//
//

}


