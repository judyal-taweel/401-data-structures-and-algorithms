package trees;

import Data.Node;

import java.util.ArrayList;

public class BineryTree<T extends Comparable<T>> {

    private Node<T> root;

    public BineryTree() {
        root = new Node<T>();
    }


    ArrayList arrayListInOrder = new ArrayList();
    ArrayList arrayListPostOrder = new ArrayList();
    ArrayList arrayListPreOrder = new ArrayList();


    public Node<T> getRoot() {
        if (root == null) {
            return null;
        }
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



//    public  boolean isEmpty(){
//        if (root==null)
//            return true;
//        else
//            return false;
//    }
//    public int getLeftBT(){
//        return root.getLeft().getKey();
//    }
//    public int getRighBT(){
//        return root.getRight().getKey();
//    }
//    int height(Node<T> node)
//    {
//        if (node == null)
//            return 0;
//        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
//    }


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


//    private int max = 0;
//
//    public Number findMax(){
//        if (getRoot() != null){
//            max = (int) getleftRight(root);
//        }
//        return max;
//    }
//    private Number getleftRight(Node<T> node){
//        if ((node.getRight() == null) && (node.getLeft() == null)){
//            if (max < (int) node.getKey()){
//                max = (int) node.getKey();
//            }
//        }
//        if (node.getRight() != null){
//            getleftRight(node.getRight());
//        }
//        if (node.getLeft() != null){
//            getleftRight(node.getLeft());
//        }
//        return max;
//    }


//    public ArrayList<Integer> breadthFirst(BineryTree tree) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if (tree.root == null) {
//            return null;
//        }
//        Queue<Node> queue = new Queue<Node>();
//        queue.enQueue(tree.root);
//        while (!queue.isEmpty()) {
//            Node node = queue.dequeue();
//            list.add(node.getKey());
//            if (node.getLeft() != null) {
//                queue.enQueue(node.getLeft());
//            }
//            if (node.getRight() != null) {
//                queue.enQueue(node.getRight());
//            }
//        }
//        return list;
//    }

//    public static BineryTree fizzBuzz (BineryTree tree, Node node) {
//
//        if (node !=null){
//            if (((int)node.getKey() % 15)==0){
//                node.setKey("FizzBuzz");
//            }
//            else if (((int)node.getKey() % 5)==0){
//                node.setKey("Buzz");
//            }
//            else if (((int)node.getKey() % 3)==0){
//                node.setKey("Fizz");
//            }
//            if (tree.root.getLeft()!= null){
//                fizzBuzz(tree, node);
//            }
//            if (tree.root.getRight()!= null){
//                fizzBuzz(tree, node);
//            }
//        }
//        return tree;
//    }




    public BineryTree<String> fizzBuzz(BineryTree<Integer> tree) {

        BineryTree<String> resultTree = new BineryTree<>();

        if (tree.getRoot().getKey() != null) {
            traverseFizzBuzzTree(tree.getRoot(), resultTree.getRoot());
        }

        return resultTree;
    }

    private void traverseFizzBuzzTree(Node<Integer> oldroot, Node<String> newRoot) {

        if (oldroot.getKey() % 15 == 0) {

            newRoot.setKey("FizzBuzz");
        } else if (oldroot.getKey() % 5 == 0) {
            newRoot.setKey("Buzz");
        } else if (oldroot.getKey() % 3 == 0) {
            newRoot.setKey("Fizz");

        } else {
            newRoot.setKey(oldroot.getKey().toString());
        }

        if (oldroot.getLeft() != null) {
            newRoot.setLeft(new Node<>());
            traverseFizzBuzzTree(oldroot.getLeft(), newRoot.getLeft());
        }

        if (oldroot.getRight() != null) {
            newRoot.setRight(new Node<>());
            traverseFizzBuzzTree(oldroot.getRight(), newRoot.getRight());
        }
    }

    public Queue<T> print() {
        Queue<T> data = new Queue<>();

        traversePrint(this.getRoot(), data);

        return data;
    }

    private void traversePrint(Node<T> root, Queue<T> data) {

        data.enQueue(root.getKey());

        if(root.getLeft() != null) {
            traversePrint(root.getLeft(), data);
        }
        if (root.getRight() != null) {
            traversePrint(root.getRight(), data);
        }
    }



}
