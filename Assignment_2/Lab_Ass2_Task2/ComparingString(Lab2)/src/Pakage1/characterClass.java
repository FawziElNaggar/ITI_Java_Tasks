
package Pakage1;

import java.util.function.BiPredicate;

public class characterClass {
    //cheak String whether the first of the two is “better” according to leangh.
    static BiPredicate<String, String> p = (str1, str2) -> str1.length() > str2.length();
    public static boolean betterString(String str1, String str2) {
        return p.test(str1, str2);
    }
    
    //check whether a string contains only alphabets or not.
    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.chars().allMatch(Character::isLetter)));
    }
   
    
}
