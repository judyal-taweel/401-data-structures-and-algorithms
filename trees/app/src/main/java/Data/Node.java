package Data;

public class Node<T> {
    private  T key;
    private Node<T> left;
    private Node<T> right;

    public Node() {

    }

    public void setKey(T key) {
        this.key = key;
    }

    public Node(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
