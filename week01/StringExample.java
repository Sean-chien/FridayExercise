package week01;

public class StringExample {
    public static void main(String[] args) {
        // Immutable!
        String s1 = "Hello World";
        String first = s1.substring(0, 1); // "H"
        char firstChar = s1.charAt(0); // 'H'

        String s2 = "Hello World";
        String s3 = new String("Hello World");

        System.out.println(s1 == s3); // compares memory addresses
        System.out.println(s1.equals(s3)); // compares contents
        System.out.println(s2.substring(0, 5));

        String[] splitted = s1.split(" ");
        System.out.println(splitted[0]); // Hello
        System.out.println(splitted[1]); // World
        // s1.strip();

        // Concatenation (combine)
        String concat = "Hello " + "World"; // + op
        System.out.println(concat + "!");

        String test1 = "A";
        String test2 = "B";
        System.out.println(test2.compareTo(test1));
        // A.compareTo(B) // lexicographic order == dictionary order
        // 1: A > B
        // 0: A and B are the same
        // -1: A < B

    }
}

