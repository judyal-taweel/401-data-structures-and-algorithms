package trees;

import Data.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BineryTree<T> extends Queue<T> {

    private Node<T> root;

    ArrayList arrayListInOrder = new ArrayList();
    ArrayList arrayListPostOrder = new ArrayList();
    ArrayList arrayListPreOrder = new ArrayList();


    public Node<T> getRoot() {
        return root;
    }

    public Node<T> setRoot(Node<T> root) {
        this.root = root;
        return root;
    }

    public void inOrder(Node<T> node){
        if(node != null){
            inOrder(node.getLeft());
            arrayListInOrder.add(node.getKey());
            inOrder(node.getRight());
        }
        }



    public  boolean isEmpty(){
        if (root==null)
            return true;
        else
            return false;
    }
    public int getLeftBT(){
        return root.getLeft().getKey();
    }
    public int getRighBT(){
        return root.getRight().getKey();
    }
    int height(Node<T> node)
    {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }


    public void postOrder(Node<T> node){
        if(node != null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            arrayListPostOrder.add(node.getKey());
        }
    }

    public void preOrder(Node<T> node){
        if(node != null){
            arrayListPreOrder.add(node.getKey());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }


    private int max = 0;

    public Number findMax(){
        if (getRoot() != null){
            max = (int) getleftRight(root);
        }
        return max;
    }
    private Number getleftRight(Node<T> node){
        if ((node.getRight() == null) && (node.getLeft() == null)){
            if (max < (int) node.getKey()){
                max = (int) node.getKey();
            }
        }
        if (node.getRight() != null){
            getleftRight(node.getRight());
        }
        if (node.getLeft() != null){
            getleftRight(node.getLeft());
        }
        return max;
    }


    public ArrayList<Integer> breadthFirst(BineryTree tree) {
        ArrayList<Integer> list = new ArrayList<>();
        if (tree.root == null) {
            return null;
        }
        Queue<Node> queue = new Queue<Node>();
        queue.enQueue(tree.root);
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            list.add(node.getKey());
            if (node.getLeft() != null) {
                queue.enQueue(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.enQueue(node.getRight());
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
