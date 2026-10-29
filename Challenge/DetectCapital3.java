package Challenge;

import java.util.Scanner;

// ============== LeetCode -  520. Detect Capital==============

public class DetectCapital3 {

    public static  boolean detectCapitalUse(String word) {

        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
            return true;
        }

        if(Character.isUpperCase(word.charAt(0))  &&
                word.substring(1).equals(word.substring(1).toLowerCase())){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String - ");
        String word = sc.nextLine();

        System.out.println(word+" is a Capital - "+detectCapitalUse(word));
    }
}


/*
The word is valid if it follows any one of these rules:
1. ABC — all uppercase.
2. abc — all lowercase.
3. Abc — first uppercase, remaining lowercase.
Otherwise, return false.

Time complexity: (O(n))
Space complexity: (O(n)) for the temporary strings in this implementation.
 */