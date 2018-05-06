package Lab4.templateMethod;

public class Utils {
    public static String reverseString(String input) {
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(input);
        return reverseString.reverse().toString();

    }
}
