// Write a function called count_vowels that takes a string as input and returns 
// the number of vowels (a, e, i, o, u) in the string. The function should be case-insensitive.

package test;

public class vowels {
    public static void vowelCount (String s){
        char[] chars = s.toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c: chars){
            if (c== 'a' || c== 'A' ||
            c == 'e' || c== 'E' || 
            c == 'i' || c== 'I' || 
            c == 'o' || c== 'O' || 
            c == 'u' || c== 'U' ){
                vowelCount ++;

            }
            else {
                consonantCount ++;
            }
        }
        System.out.println( "vowelCount:"+ vowelCount+ "   " + "consonantCount:"+ consonantCount);
    }
    public static void main (String[] args){
        String s = "aeiouX";
        vowelCount(s);
    }
}
