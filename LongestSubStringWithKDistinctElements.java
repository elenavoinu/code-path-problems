package week7Session2;

import java.util.HashMap;

public class LongestSubStringWithKDistinctElements {
    public static void main(String[] args) {
       // String str = "cbbebi";
        String str = "araaci";
        System.out.println(findLongestSubStringWithDistinctElements(str, 1)); //output 2
    }
    public static int findLongestSubStringWithDistinctElements(String str, int k) {
        int windowStart = 0;
        int windowEnd = 0;
        int maxLength = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        while (windowEnd < str.length()) {
            char right = str.charAt(windowEnd);
            hm.put(right, hm.getOrDefault(right, 0) + 1);
            windowEnd++;

            if(hm.size() > k) {
                char left = str.charAt(windowStart);
                hm.put(left, hm.get(left) - 1);
                if(hm.get(left) == 0) //if the frequency of the letter = 0, remove it since we're looking for maximum freq
                    hm.remove(left);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart);
        }

        return maxLength;

    }
}

/*
U:
Find longest substring with no more than k unique letters and return it's size
Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".

M:
Sliding window

P:
Create a hashtable to store the characters from thew string
declare 3 variable: windowStart, windowEnd, & maxLength
iterate over the string while windowEnd < string length
add the characters and their count to the hashmap
expand the window
check if the size of hashmap is greater than k
if it is:
remove the first element from the window by moving the window from start
calculate the maximum length using Math.max built-in method

E:
O(n) time complexity where n is the characters in the string
O(K) as we will be storing k characters in the hash map

 */