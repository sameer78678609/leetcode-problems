class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node head;
        static void deleteNth(int val) {
        if (head == null)
            return;

        if (head.data == val) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
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
public class deleted{
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

        LinkedList.deleteNth(30);
        System.out.println("After Deleting 30:");
        list.printList();

    }
}

