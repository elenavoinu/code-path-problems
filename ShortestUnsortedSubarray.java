package week7Session1;


public class ShortestUnsortedSubarray {
    public static void main(String[] args) {
        int [] array = new int[]{1, 2, 5, 3, 7, 10, 9, 12};
        System.out.println(shortestUnsortedSubarray(array));
    }
    public static int shortestUnsortedSubarray(int []array){
        int left = 0;
        int right = array.length - 1;

        // Step 2: find the first number out of sorting order from the beginning
        while( left < array.length - 1 && array[left] <= array[left + 1]) {
            left++;
            //check if the array is sorted
            if(left == array.length - 1) return 0;
        }

        // Step 3: find the first number out of sorting order from the end
        while(right > array.length - 1 && array[right] >= array[right - 1]) {
            right--;
        }
        // Step 4: find the maximum and minimum of the subarray
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = left; i < right; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        // Step 5: extend the subarray to include any number which is bigger than the minimum of the subarray
        while(left > 0 && array[left - 1] > min) {
            left--;
        }
        // Step 6: extend the subarray to include any number which is smaller than the maximum of the subarray
        while(right < array.length - 1 && array[right + 1] < max) {
            right++;
        }

        return right - left + 1;

    }
}
/*
U:
array will not be empty
array contains negative numbers
if array contains 1 element then it is sorted and we return zero because there's nothing to sort

M:
Two pointer technique

P:
1. Initialize LeftPtr at the start index and RightPtr at the last index
2. Iterate LeftPtr from left -> right as long as it points to elements in the increasing order.
 Break when arr[LeftPtr] < arr[index] (that's when you've spotted the first element that is out of order from left)
3. Iterate RightPtr from right -> left as long as it points to elements in the decreasing order.
 Break when arr[RightPtr] > arr[index] (that's when you've spotted the first element from right, that is out of order)
4. We now have found a candidate sub-array. Find the local min and local max in this sub array
5. Extend the sub-array from LeftPtr to the beginning of the array to include elements greater than the local min.
This is to make sure that all the remaining elements to the left are indeed less than all elements in the subarray
6. Extend the sub-array from RightPtr to the end of the array to include elements smaller than the local max.
This is to make sure that all the remaining elements to the right are indeed greater than all elements in the subarray

E:
Time Complexity – Best Case: O(N)

Space Complexity – Best Case: O(1)

 */
