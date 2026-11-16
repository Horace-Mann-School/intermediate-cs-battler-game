public class Utility {
    public static void validateNonNegative(int num){
        if(num<0) {
            throw new IllegalArgumentException("number cannot be negative : " + num);
        }
    }

    public static void validateNotNull(String x){
        if(x == " " || x == null || x == "") {
            throw new IllegalArgumentException("string cannot be null : " + x);
        }
    }
}
