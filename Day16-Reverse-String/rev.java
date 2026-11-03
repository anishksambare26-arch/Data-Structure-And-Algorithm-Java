import java.util.*;

public class rev {
    public static void reverseString(char[] a) {
        int i = 0, j = a.length - 1;
        // Continue swapping until both pointers meet
        while (i < j) {
            // Store the first character temporarily
            char temp = a[i];
            // Replace the first char with the last char
            a[i] = a[j];
            // Replace the last char with the stored char
            a[j] = temp;
            i++;
         // Move the second pointer 
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        // Convert the string into a character array
        char[] a = str.toCharArray();
        // Call the method to reverse the character array
        reverseString(a);
        // Convert the reversed character array back into a string and print it
        System.out.println("Reversed String : " + new String(a));
        // Close the Scanner
        sc.close();
    }
}





