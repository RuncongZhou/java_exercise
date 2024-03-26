package ex2;
import java.util.Scanner;
public class DecimalDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number =  scanner.nextDouble();
		scanner.close();
		double min = Math.pow(Math.E, -9);
        double max = Math.pow(Math.E, 9);
		if (number < min || number > max) {
            System.out.println("The number is not within the range.");
		}
		else {
			String numberStr = String.format("%.10f", number);
			int start = 5;
			int end = 10;
			String subDecimal = numberStr.substring(numberStr.indexOf('.') + start, numberStr.indexOf('.') + end + 1);
			System.out.print(subDecimal);
		}
		scanner.close();
	}
}