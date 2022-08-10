package week9;

public class CustomIntegerToBinary {
//    To convert an integer n into its binary format, we need to:
//    Store the remainder when number n is divided by 2 and update the number n with the value of the quotient
//    Repeat step 1 until the number n is greater than zero
//    Finally, print the remainders in reverse order

    public static void main(String[] args) {
        int num = 7;
        System.out.println(convertToBinary(num));
    }
    public static String convertToBinary(int num) {
        if(num == 0) return "0";
        StringBuilder binaryNum = new StringBuilder();
        while(num > 0) {
            int remainder = num%2;
            binaryNum.append(remainder);
            num /= 2;
        }
        binaryNum.reverse();
        return binaryNum.toString();
    }
}
