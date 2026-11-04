import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        // Store the length of the string
        int len = str.length();
        // Initially assume the string is a palindrome
        boolean pal = true;
        // Check palindrome using for loop
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) {
                pal = false;
                break;
            }
        }
        // Check the final result
        if(pal) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is NOT Palindrome");
        }
    }
}
