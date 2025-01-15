
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input string with extra characters: ");
        String input = scan.nextLine();
        // String input = "a-bcd";
        String output = reverseOnlyLetters(input);
        System.out.println("Reversed string: " + output); // Output: d-cba

        scan.close();
    }

    
    public static String reverseOnlyLetters(String s) {
        
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Skip non-alphabetic characters
            // while (left < right && !Character.isLetter(arr[left])) {
            //     left++;
            // }
            // while (left < right && !Character.isLetter(arr[right])) {
            //     right--;
            // }

            // Swap the letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);

    }
}