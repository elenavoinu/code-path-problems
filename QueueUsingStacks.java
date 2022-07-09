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

         public  void push(int x) { //enqueue
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

         public  int pop() { //dequeue
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
* U:
* Implement a queue using stack data structure.
* to remove an element: Stack empty-> error
* stack has one element -> remove it
* M:
* Queue: FIFO   Stack: LIFO
*
* P:
* Create 2 stacks:
* Push elements in the first stack
* To put the element at top of stack1, stack2 is used.
*
* push method:
* iterate over the stack1 while the size is greater than 0
* push everything from stack1 to stack2.
*
*
*
* */
