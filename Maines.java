class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    public static void removeDuplicate() {
        Node current = head;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class Maines {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        int[] arr = {10, 20, 20, 30, 40};

        LinkedList.head = null;

        for (int value : arr) {
            LinkedList.Node newNode = new LinkedList.Node(value);

            if (LinkedList.head == null) {
                LinkedList.head = newNode;
            } else {
                LinkedList.Node temp = LinkedList.head;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = newNode;
            }
        }

        System.out.println("Original List:");
        list.printList();

        LinkedList.removeDuplicate();
        System.out.println("After Removing Duplicates:");
        list.printList();

      
    }
}
