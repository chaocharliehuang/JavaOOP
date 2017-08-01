public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printValues();
        list.remove();
        list.remove();
        list.printValues();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printValues();

        Node node10 = list.find(10);
        System.out.println(node10.getValue());
        System.out.println(node10.getNext().getValue());

        list.removeAt(10);
        list.printValues();
        list.removeAt(2);
        list.printValues();
        list.removeAt(0);
        list.printValues();
        list.removeAt(3);
        list.printValues();
    }
}