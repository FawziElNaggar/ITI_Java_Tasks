
package file.handling.and.data.extraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author FreeComp
 */
public class ExplorAllData {
     public void load_data() {  
     try  {
            //Get scanner instance
            File fileCSV = new File("‪E:\\Java\\pyramids.csv");
         //Set the delimiter used in file
         try (Scanner scanner = new Scanner(fileCSV)) {
             //Set the delimiter used in file
             scanner.useDelimiter(",");
             //Get all tokens and store them in some data structure
             //I am just printing them
             while (scanner.hasNext()) {
                 System.out.print(scanner.next() + "|");
             }
             //Do not forget to close the scanner
         }
        } catch (FileNotFoundException ex) {
            System.out.println("somthing worong when read file");
        }
    }
}
    

