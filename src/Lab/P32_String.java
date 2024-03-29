public class Program32_String {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Use of length() method
        int len = str.length();
        System.out.println("Length of the string is: " + len);
        
        // Use of charAt() method
        char ch = str.charAt(0);
        System.out.println("Character at 0 index is: " + ch);
        
        // Use of substring() method
        String substr = str.substring(0, 5);
        System.out.println("Substring from 0 to 5 is: " + substr);
        
        // Use of indexOf() method
        int index = str.indexOf('W');
        System.out.println("Index of 'W' is: " + index);
        
        // Use of equals() method
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is str equals to 'Hello, World!': " + isEqual);
    }
}

