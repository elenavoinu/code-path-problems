package week6Session2;

import java.util.*;

public class ReversingKElementsOfAQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        reverse(queue, 5);

        while(!queue.isEmpty()) {
            System.out.println(queue.peek() + "");
            queue.remove();
        }
    }

    public static void reverse(Queue<Integer> queue, int k) {
         if(queue.isEmpty() || k > queue.size())
            System.out.println("queue" + queue + " is empty");
        if(k <= 0)
            System.out.println("k must be greater than zero");

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for(int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }
}

/*
* U:
* Given a queue and an integer k, we need to reverse the order of the first
* k elements, leaving the other elements in their original order
*
Input :  Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100],  k = 4
Output : Q = [40, 30, 20, 10, 50, 60, 70, 80, 90, 100]
If queue is empty or if k is greater than queue's size -> return the original queue

M: Using a stack

P: Create an empty stack
* dequeue elements in the queue one by one and push them in the stack
* Add the contents of stack at the backk of the queue
* dequeue size -k elements from the front and enqueue them one by one to the same queue
*/
//Time Complexity: O(n+k) where n is the total number of elements in the queue
// and k is the number of elements to be reversed.
// Space :Use of stack to store values for the purpose of reversing: O(n)
