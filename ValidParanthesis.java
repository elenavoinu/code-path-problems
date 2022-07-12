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
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put('(', ')');
        mappings.put('{', '}');
        mappings.put('[', ']');

        Stack<Character> stack = new Stack();
        for(int i = 0; i < str.length(); i++) {
            if(mappings.containsKey(str.charAt(i))) {
                if(stack.empty() || stack.pop() != mappings.get(str.charAt(i))) return false;
                else
                    stack.push(str.charAt(i));
            }
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
 Create a hash table and store the characters (mappings, ex: '(' is mapped to ')'
 Add the characters to the map
 Create a stack
 Iterate over the string
 Check if map contains the character in the string, push it to the stack if:
 stack.pop!=maps.get(c) or if the stack is empty

 return stack.empty()

 E:
 O(n) time and space complexity


* */
