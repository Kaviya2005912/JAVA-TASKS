import java.util.*;

public class Kaviya {
    public static void main(String[] args) {
        String s = "Hello";

        // Print substrings
        for(int i = 0; i <= s.length(); i++) {
            String s1 = s.substring(0, i);
            System.out.println(s1);
        }

        // Remove vowels
        String noVowels = s.replaceAll("[AEIOUaeiou]", " ");
        System.out.println("Original: " + s);
        System.out.println("Without vowels: " + noVowels);
    }
}

    
