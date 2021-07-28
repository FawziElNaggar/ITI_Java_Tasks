
package Pakage1;

import static Pakage1.characterClass.isStringOnlyAlphabet;
import static Pakage1.characterClass.betterString;
/**
 *
 * @author FreeComp
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Java 8";
        String str2 = "Javayyyy";
          //cheak better string
        System.out.println("The first String : " + str1);
        System.out.println("The second String : " + str2);
        System.out.println("Is the first String better or not ? " + betterString(str1, str2));
        
        
        //check whether a string contains only alphabets or not.
        System.out.println("Is the String : "+ str1 + " Has a alphabets or not ? " + isStringOnlyAlphabet(str1));
        System.out.println("Is the String : "+ str2 + " Has a alphabets or not ? " + isStringOnlyAlphabet(str2));
    }  
}
