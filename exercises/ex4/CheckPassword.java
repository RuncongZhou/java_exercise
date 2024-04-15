package cw3;

public class CheckPassword {
	 public static void main(String[] args) {
	        // Check if a password has been provided
	        if (args.length == 0) {
	            System.err.println("Usage: java CheckPassword <password>");
	            System.exit(1);
	        }   
	        String password = args[0];
	        boolean isValid = longEnough(password) && atLeastTwoDigits(password);
	        
	        if (isValid) {
	            System.out.println("Password is valid");
	        } else {
	            System.out.println("Password is not valid");
	        }
	    }
	    public static boolean longEnough(String password) {
	        // Check if the password has at least twelve characters
	        return password.length() >= 12;
	    }
	    public static boolean atLeastTwoDigits(String password) {
	        int digitCount = 0;
	        // Check each character to see if it's a digit
	        for (int i = 0; i < password.length(); i++) {
	            if (Character.isDigit(password.charAt(i))) {
	                digitCount++;
	                if (digitCount >= 2) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
}
