import java.util.Scanner;
public class PalindromeChecker {
	public static void main(String[] args) {
		boolean ispalindrome = true;
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		if(input.length()>1000)
		{
			  System.out.println("The string is too long. Please enter a string of length up to 1000.");
		}
		else
		{
			for(int i=0; i<input.length()/2; i++)
			{
				if(input.charAt(i) != input.charAt(input.length()-i-1))
				{
					ispalindrome = false;
					break;
				}
			}
			if(ispalindrome)
			{
				System.out.println("The string is a palindrome.");
			}
			else
			{
				System.out.println("The string is not a palindrome.");
			}
		}
	}
}
