package Week3Session1;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class RemoveDuplicateFromLinkedList {

    public static void main(String[] args) {

        ListNode list = new ListNode(1);

        System.out.println(removeDuplicates((list)));
    }

    static ListNode removeDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode p = head.next;

        while(p != null){
            if(p.val == prev.val){
                prev.next = p.next;
                p = p.next;
                //no change prev
            }else{
                prev = p;
                p = p.next;
            }
        }

        return head;

    }

}
