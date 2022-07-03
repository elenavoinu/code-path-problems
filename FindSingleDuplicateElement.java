package distinct.indeces;
import java.util.HashSet;

public class FindSingleDuplicateElement {
    public static void main(String[] args) {
        int [] input = new int[] {4,2,2,1,1,9,4}; //4,1,2,1,2
        System.out.println(singleNumber(input));
    }

    public static int singleNumber(int[] array) {
        int result = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : array) {
            if(hashSet.contains(num)){
                hashSet.remove(num);
            }
            else hashSet.add(num);
        }
        for(Integer num : hashSet) {
            result = num;
        }
        return result;
    }
}
