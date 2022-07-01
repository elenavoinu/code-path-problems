package Week4Session2;
import java.util.ArrayList;

public class IsLinkedListPalindrome {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = head;

        while(current != null) {
            values.add(current.val);
            current = current.next;
        }
        int start = 0;
        int end = values.size() - 1;

        while(start < end) {
            if(!values.get(start).equals(values.get(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
//P: Given a linked list, determine if it is a palindrome.

//U: Input: 1->2->3->2->1 Output: true
//List is empty -> return false
//Input: 2  Output -> true
//M:
// 2 pointer technique

//P:
//Create an array to store nodes' valuesCopy the node's value in an arraylist
//Initialize a note to head: ListNode current = head;
//Iterate the linked list while current != null and copy the data to the array list
//update current to current.next to keep adanvancing the linked list
// initialize 2 pointers of int datatype
//start = 0, end = array list size - 1
//in a while loop, compare if start and end point to the same value
// return false if they font
//increment startn to move to the next value
// decrement end
//return true

//E
//O(n) runtime
//O(n) space since we're using a list to store the ll values