package test;

public class Palindrome{
    public static boolean isPalindrome (String s){

    boolean palindrome = true;
            for (int i=0; i<s.length()/2; i++){
                if (s.charAt(i) != s.charAt(s.length()) -i -1){
                    palindrome = false;
                    break;
                }
            }
            return palindrome;
        }
        public static void main (String[] args){
            String s= "racecar";
            System.out.println(isPalindrome(s));
        }
    }

    // public class PalindromeChecker {
    //     public static boolean isPalindrome(String s) {
    //         s = s.replaceAll(" ", "").toLowerCase(); // Remove spaces and convert to lowercase
    //         int left = 0, right = s.length() - 1;
            
    //         while (left < right) {
    //             if (s.charAt(left) != s.charAt(right)) {
    //                 return false;
    //             }
    //             left++;
    //             right--;
    //         }
    //         return true;
    //     }

    //Write a function called count_vowels that takes a string as input and returns the number of vowels (a, e, i, o, u) in the string. The function should be case-insensitive.