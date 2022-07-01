package Week4Session2;

public class SwapNodesInLinkedList {
    public static void printList(ListNode listNode) {
        while(listNode !=null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
        System.out.println("NULL");

    }

    //Review
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Given Linked List");
        printList(head);

        head = swapPairs(head);

        System.out.println("Modified list");
        printList(head);

    }
    //Implement
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode secondNode = head.next;
        head.next = swapPairs(secondNode.next);
        secondNode.next = head;

        return secondNode;
    }


}

//Problem: Given a linked list, swap nodes in pair
//U:
//Input: 1->2->3->4
//Output: 2->1->4->3

//Input: [] Output: []
//Input: [1] Output: [1]

//M: Two pointer approach
//recursive solution

//P
/*Check if head of the list is empty or it's next value is null and return the head if
the condition is true
Declare 2 pointers: firstNode, secondNode of type ListNode
and assign the head and head.next respectively
update firstNode.next value using the recursive call and passing in second.next argument
update second.next to point to firstNode

return the second value since it's the head of the list now
* */
//E
//O(n) time complexity where n is the size of the list
//O(n) space used for recursion

//============Iterative solution============
//P:
//declare to pointers: prevNode and dummyNode:
// dummyNode = new ListNode(); dummyNode.next = head;prevNode = dummy
//Iterate over the list while head is not null
//declare first and second node
//Swap the nodes by rearranging the order
//prevNode.next = second;
//firstNode.next = second.next;
//second.next = first;
//reinitialize the prev and head for the next iteration
//prevNode = firstNode
//head = firstNode.next

//return dummy.next
