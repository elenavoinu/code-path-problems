package Week4Session2;

public class RemoveDuplicatesFromSortedLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(2, new ListNode(2, new ListNode(2,
                new ListNode(3, new ListNode(3))))));
        ListNode listNode1 = removeDuplicates(listNode);
        System.out.println(listNode1.val + "" + listNode1.next.val + "" + listNode1.next.next.val);
    }

    public static ListNode removeDuplicates(ListNode head) {

        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;

        }
        return head;
    }
}

// Problem #3: Remove Duplicates from Sorted List
// Given a sorted linked list, delete all duplicates such that each element appear only once.

//U:
//Input = 1->2->3 Output: original list

//Input: null   Output: original list

// Input:  1->1->2
// Output: 1->2

// Input:  1->1->2->3->3
// Output: 1->2->3

//M: Because the input list is sorted, we can determine if a node is a duplicate by comparing its value to the node after it in the list.

//P:
//if head is null or head.next is null return the head of the list
//initialize a node pointer to head: ListNode current = head
//iterate over the list while curent!=null and current.next!=null
//check if current node's value equals curent's next value
// if the above condition is true, then we assign current's next to be equal to curent's next next
//else current = current.next
//return head