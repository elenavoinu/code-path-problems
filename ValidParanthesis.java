//working with stacks

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        String string = "'(', ')', '{', '}', '[', ']'";
        System.out.println(isValidString(string));
    }
    
    public static boolean isValidString(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '[' || ch =='{')
                stack.push(ch);
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') 
                stack.pop();
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            
            else if(ch == '}' && !stack.isEmpty() && stack.peek() =='{') 
                stack.pop();
            else return false;
        }
        
       return stack.empty();
    }
}

/*
U: string consists just of these characters '(', ')', '{', '}', '[', ']',
 determine if the input string is valid.
 An input string is valid if:
 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.

 Input: s = "(]"
 Output: false

 Input: s = "()[]{}"
 Output: true

 M:
 Using stack

 P:
 Create a stack
 Iterate over the string
 Check if map contains the character in the string, push it to the stack if:

 return stack.empty()

 E:
 O(n) time and space complexity


* */
