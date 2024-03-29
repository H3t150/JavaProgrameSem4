public class Program33_Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        // Use of append() method
        sb.append(", World!");
        System.out.println("After append: " + sb);
        
        // Use of insert() method
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        // Use of reverse() method
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // Use of delete() method
        sb.delete(0, 5);
        System.out.println("After delete: " + sb);
        
        // Use of length() method
        int len = sb.length();
        System.out.println("Length of the string buffer is: " + len);
    }
}

