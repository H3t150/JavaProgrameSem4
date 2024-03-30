public class WrapperExample {
    public static void main(String[] args) {
        // 1. Integer.valueOf() - Returns an Integer object representing the specified int value
        int num = 10;
        Integer integerObj = Integer.valueOf(num);
        System.out.println("Integer value: " + integerObj);

        // 2. Double.parseDouble() - Returns a Double object holding the double value represented by the argument string
        String doubleStr = "3.14";
        Double doubleObj = Double.parseDouble(doubleStr);
        System.out.println("Double value: " + doubleObj);

        // 3. Boolean.valueOf() - Returns a Boolean with a value represented by the specified string
        String boolStr = "true";
        Boolean boolObj = Boolean.valueOf(boolStr);
        System.out.println("Boolean value: " + boolObj);

        // 4. Long.toHexString() - Returns a hexadecimal string representation of the long argument
        long longValue = 255;
        String hexString = Long.toHexString(longValue);
        System.out.println("Hexadecimal representation of " + longValue + ": " + hexString);

        // 5. Character.isDigit() - Determines if the specified character is a digit
        char ch = '7';
        boolean isDigit = Character.isDigit(ch);
        System.out.println("Is " + ch + " a digit? " + isDigit);
    }
}
