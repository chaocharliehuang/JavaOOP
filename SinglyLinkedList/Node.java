public class Node {
    private int value;
    private Node next;

    public Node(int num) {
        this.value = num;
        this.next = null;
    }

    public void setValue(int num) {
        this.value = num;
    }

    public int getValue() {
        return this.value;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getNext() {
        return this.next;
    }
}