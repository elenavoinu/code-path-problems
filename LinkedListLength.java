package Week4Session2;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val,ListNode next) { this.val = val; this.next = next;
    }
}
public class LinkedListLength {

    public static void main(String[] args) {
        //Review
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(lengthOfLinkedList(l1));

    }
    public static int lengthOfLinkedList(ListNode head) {
        int length = 0;
        ListNode current = head;

        while(current != null) {
           current = current.next;
           length++;
        }
        return length;
    }
}

//Problem: Given a singly linked list, return its length

//U:
//input: null  output: 0
//input: 1->2->3->4 output: 4

//M: iterative and recursive

//P iterative solution:
//initialize a count variable to 0
//Initialize a node pointer to head: ListNode current = head
//iterate the list while current!=null
//current = current.next
//increment count
//return count

//Evaluate:
//O(n) time complexity where n = the nodes in the list
//o(1) Space complexity as no extra space is used
