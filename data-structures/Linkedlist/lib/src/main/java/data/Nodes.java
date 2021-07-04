package data;

public class Nodes {
    private Nodes next;
    public int data;


    public Nodes(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Nodes next) {
        this.next = next;
    }

    public Nodes getNext() {
        return next;
    }
}
