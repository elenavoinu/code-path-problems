//very expensive implementation and most likely never used in real life.
//Implementation solely for exercising purposes

package week6Session2;
import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
//        myQueue.push( 1);
//        myQueue.push(2);
//        myQueue.push(3);

        System.out.println("Top element: "+ myQueue.peek());
        System.out.println("Stack empty: " + myQueue.empty());
      //  System.out.println("Remove element: " + myQueue.pop());
      //  System.out.println("Top element: "+ myQueue.peek());

    }

      static class MyQueue {
         Stack<Integer> stack1 = new Stack<>();
         Stack<Integer> stack2 = new Stack<>();

         public  void enqueue(int x) { 
             //Move all elements from stack1 to stack2
             while(!stack1.isEmpty()) {
                 stack2.push(stack1.pop());
             }
             // Push elements into stack1
             stack1.push(x);

             //put all elements back into stack1
             while(!stack2.isEmpty()) {
                 stack1.push(stack2.pop());
             }
         }

         public  int dequeue() { 
             if(stack1.isEmpty()) return -1;
             return stack1.pop();
         }

         public  int peek() {
             if(!stack1.isEmpty()) return stack1.peek();
             return -1;

         }

         public  boolean empty() {
             return stack1.isEmpty();
         }
     }

}


/*
Constructor
1) Create 2 Stacks, a main and a side

Push
1) Push elements onto the main Stack, never the side

Pop/Poll
1) Pop all elements off of the main Stack onto the side Stack, this reverses
    element order to that of a Queue
2) Pop top off side Stack into temporary variable
3) Push all other elements from side stack onto main Stack, re-reversing elements
4) Return element in temporary variable

Peek
1) Return the first element in the main Stack by indexing (since DS is array)

Empty
1) Return True if the length of the main Stack is 0, else False

Push/Enqueue Time Complexity: O(1)
Pop/Dequeue Time Complexity: O(N)
Peek Time Complexity: O(1) - Python, O(N) - Java
Empty Time Complexity: O(1)
Space Complexity: O(N)

* */
