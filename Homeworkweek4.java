package Week4Session2;

public class Homeworkweek4 {
    static class Node {
        int data; Node next;
    }
    static Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }
    static Node rearrangeEvenOdd(Node head) {
        if (head == null) return null;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next !=null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    static void printlist(Node node) {
        while (node != null)
        {
            System.out.print(node.data + "->");
            node = node.next;
        }
            System.out.println("NULL") ;
    }
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
      //head.next.next.next.next = newNode(5);

        System.out.println("Given Linked List");
        printlist(head);

        head = rearrangeEvenOdd(head);

        System.out.println("Modified Linked List");
        printlist(head);
        }
    }

