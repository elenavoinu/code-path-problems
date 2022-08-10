package week8;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = new int[] {7, 10, 4, 3, 20, 15}; // 7
        int num = 3;
        System.out.println(kThSmallestElement(array, num));
    }
    public static int kThSmallestElement(int[] array, int k) {
//        Arrays.sort(array);
//        return array[k - 1];
        if(array == null || array.length == 0 || k > array.length) return 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : array) {
            minHeap.add(i);
        }
        while(--k > 0){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
