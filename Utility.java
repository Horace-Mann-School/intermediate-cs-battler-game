public class Utility {
    //This class is just to store general utility methods 

    //Takes a number and validates between a range of int min and int max with the errorMessage of choice
    public static void validateNum(int n, int min, int max, String errorMessage) {
	    if (n > max && n < min) {
            throw new IllegalArgumentException("number is " + errorMessage + ": "+ n);
        }

    }

    //Takes a String and validates whether it's empty or null, using variable name in error message with parameter errorMessage
    public static void validateString(String s, String errorMessage) {
        if (s == "" || s == null) {
            throw new IllegalArgumentException(errorMessage + " cannot be empty or null: " + s);
        }
    }
}
