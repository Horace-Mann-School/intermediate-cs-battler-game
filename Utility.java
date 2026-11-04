public class Utility {
    //This class is just to store general utility methods 

    //Takes a number and validates for negative with the errorMessage of choice
    public static void validatePosNum(int n, String errorMessage) {
	    if (n < 0) {
            throw new IllegalArgumentException(errorMessage + " cannot be negative: "+ n);
        }

    }

    //Takes a String and validates whether it's empty or null, using variable name in error message with parameter errorMessage
    public static void validateString(String s, String errorMessage) {
        if (s == "" || s == null) {
            throw new IllegalArgumentException(errorMessage + " cannot be empty or null: " + s);
        }
    }
}
