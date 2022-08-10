package week7Session2;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String [] toReverse = "The weather is amazing today!".split(" ");
        System.out.println(toReverseWords(toReverse));
    }
    public static String toReverseWords(String [] str) {
        StringBuilder result = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--){
            result.append(str[i]).append(" ");

        }
        return result.toString();
    }
}
