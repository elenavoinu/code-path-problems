package Week1Session1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 7, 7, 8, 9, 8, 7};
        System.out.println(findFrequency(array, 3));
    }

    static int findFrequency(int[] array, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int j : array) {
            if (hashMap.containsKey(j)) {
                hashMap.put(j, hashMap.get(j) + 1);
            } else hashMap.put(j, 1);
        }
        for (int j : array) {
            if (hashMap.containsKey(j)) {
                if (hashMap.get(j) == k) {
                    return j;
                }
            }
        }

      //  hashMap.forEach((a, v) ->{ System.out.println(a + ": " + v); });
        return -1;
    }
}
//U: what to return if we have multiple elemts matching k=3:  example [3,3,3,2,2,2]
//array empty, k times does not exist meaning all elements apper exactly once
//
//M:
// Using a set or hashmap
//P:
//using set:
//1.create a set
//2. iterate over the input array
//3. add the array elements to set
//4. have 2 variables curent max and max declared to keep track of the current maximum frequency
//5. if set contains element in the array, increment current max, otherwise add it to the set
//6. Update the max frequency and return it
//using hashtable:
//create the table
//iterate the input array
//check if table contains element in the array
//if it contain array[i] increment the counter
//otherwise add it to the table
//return the count