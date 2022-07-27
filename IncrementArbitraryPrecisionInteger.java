package week7Session1;

import java.util.Arrays;

public class IncrementArbitraryPrecisionInteger {
    public static void main(String[] args) {
        int [] input = new int[]{1,2,3};
        System.out.println(Arrays.toString(incrementArbitraryPrecisionInteger(input)));
    }
    public static int [] incrementArbitraryPrecisionInteger(int[] array) {
        for(int i = array.length - 1; i >= 0; i--) {
            // set all the nines at the end of array to zeros
            if(array[i] == 9) {
                array[i] = 0;
            }
            // increase this rightmost not-nine by 1
            else {
                array[i]++;
                return array;
            }
        }

        // we're here because all the digits are nines
        int[] result = new int[array.length+1];
        result[0] = 1;
        return result;

    }
}
/*
U:
an the input represent a negative number?
No. Each digit ranges from 0 to 9 inclusive.
What exactly is an arbitrary precision integer?
Precision refers to the number of digits in a number.
An arbitrary precision integer is an integer "whose digits of precision are limited only by the available memory of the host system"
(i.e. the precision, or number of digits, is only limited by the available memory)
Input: [5,8,9]
Output: [5,9,0]
Explanation: 589 + 1 = 590

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

P:
Move along the input array starting from the end of array.
Set all the nines at the end of array to zero.
If we meet a not-nine digit, we would increase it by one. The job is done - return digits.
We're here because all the digits were equal to nine. Now they have all been set to zero.
We then append the digit 1 in front of the other digits and return the result
E:
Time complexity: O(N) since it's not more than one pass along the input list.
Space complexity: O(N)

Although we perform the operation in-place (i.e. on the input list itself), in the worst scenario,
we would need to allocate an intermediate space to hold the result, which contains the N+1N+1 elements.
Hence the overall space complexity of the algorithm is \mathcal{O}(N)O(N).

 */