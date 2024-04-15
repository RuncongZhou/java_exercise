package cw3;
import java.util.Scanner;

public class MaximumOddBinaryNumber {
    public static String maxOddBinaryNumber(String s) {
        int onesCount = 0;
        int zerosCount = 0;
        // Count the number of '1's and '0's
        for (char c : s.toCharArray()) {
            if (c == '1') {
                onesCount++;
            } else {
                zerosCount++;
            }
        }
        // We need at least one '1' at the end to make the number odd
        if (onesCount == 0) {
            return ""; // As per the problem, there is always at least one '1'
        }
        // StringBuilder to construct the result
        StringBuilder sb = new StringBuilder();
        // Add all '1's except the last one
        for (int i = 0; i < onesCount - 1; i++) {
            sb.append('1');
        }
        // Add all '0's
        for (int i = 0; i < zerosCount; i++) {
            sb.append('0');
        }
        // Add the last '1' to ensure the number is odd
        sb.append('1');
        return sb.toString();
    }
    public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.print("s = ");
          String s = scanner.nextLine(); // Read input from user
          scanner.close();
          System.out.println(maxOddBinaryNumber(s));
    }
}

