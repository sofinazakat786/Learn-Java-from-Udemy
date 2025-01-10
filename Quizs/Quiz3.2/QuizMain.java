public class QuizMain {

    public static void main(String[] args) {
        // String created as a literal (stored in the string pool)
        String string1 = "hello";

        // String created using the 'new' keyword (not stored in the string pool)
        String string2 = new String("hello");
        System.out.println("String 1: "+string1);
        System.out.println("String 2: "+string2);
        // Compare using ==
        System.out.println("Using '==': " + (string1 == string2)); // false (different references)

        // Compare using .equals()
        System.out.println("Using .equals(): " + string1.equals(string2)); // true (same value)

    }
}
