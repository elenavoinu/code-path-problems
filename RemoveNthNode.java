package Week4Session1;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }
}

public class RemoveNthNode {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode list = removeNthNode(listNode, 2);
        assert list != null;
        System.out.println(list.val + "" + list.next.val + "" + list.next.next.val + "" +  list.next.next.next.val );

    }

    public static ListNode removeNthNode(ListNode head, int n) {
        //create a dummy node
        ListNode dummy = new ListNode(0);
        // attach it to the head of the list
        dummy.next = head;

        //Initialize 2 pointers and point them to the dummy node
        ListNode first = dummy;
        ListNode second = dummy;

        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return dummy.next;
    }
}

//
//        1) Create a dummy node and attach it to the head of the input list.
//        2) Initialize 2 pointers, first and second, to point to the dummy node.
//        3) Advance the first pointer so that the gap between the first and second pointers is n nodes
//        4) While the first pointer does not equal null
//        a) Advance the first and second pointers by 1
//        5) Delete the node being pointed to by second.
//        6) Return dummy.next
//
//        Time Complexity: O(N), N is the number of nodes in the list
//
//        Space Complexity: O(1)