public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void setHead(Node node) {
        this.head = node;
    }

    public Node getHead() {
        return this.head;
    }

    public void add(int num) {
        Node newNode = new Node(num);
        Node runner = this.head;
        if (runner != null) {
            while (runner.getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(newNode);
        } else {
            this.head = newNode;
        }
    }

    public void remove() {
        Node runner = this.head;
        if (runner != null) {
            if (runner.getNext() != null) {
                while (runner.getNext().getNext() != null) {
                    runner = runner.getNext();
                }
                runner.setNext(null);
            } else {
                this.head = null;
            }
        }
    }

    public void printValues() {
        Node runner = this.head;
        while (runner != null) {
            System.out.print(runner.getValue() + " -> ");
            runner = runner.getNext();
        }
        System.out.println("null");
    }

    public Node find(int num) {
        Node runner = this.head;
        while (runner != null) {
            if (runner.getValue() == num) {
                return runner;
            } else {
                runner = runner.getNext();
            }
        }
        return null;
    }

    public void removeAt(int n) {
        if (n > 0) {
            Node runner = this.head;
            Node temp = runner;
            while (n > 0 && runner.getNext().getNext() != null) {
                temp = runner;
                runner = runner.getNext();
                n--;
            }
            if (n == 0) {
                temp.setNext(temp.getNext().getNext());
            }
        } else if (n == 0) {
            this.setHead(this.head.getNext());
        }
    }
}