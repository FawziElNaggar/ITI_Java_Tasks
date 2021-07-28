
package file.handling.and.data.extraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FreeComp
 */
public class PyramidCSVDAO {
    
    public PyramidCSVDAO(){
    }
    public  List<Pyramid> readPyramidsFromCSV(String fileName){
      
      List<Pyramid> pyramids = new ArrayList<>();
      try  {
          File myObj = new File (fileName);
          try (Scanner scanner = new Scanner(myObj)) {
              String  dataSet ;
              dataSet = scanner.nextLine();

              while (scanner.hasNextLine()) {
                  String[] attributes = dataSet.split("," , -1);
                  pyramids.add(createPyramid(attributes)); 
                  scanner.close();
              }
          }
          } catch (FileNotFoundException ex) {
            System.out.println("somthing worong when read file");
        }
      
        return pyramids;
          
//            BufferedReader br = new BufferedReader(new FileReader(fileName));
//            String line = br.readLine();
//            if (line != null) {
//                line = br.readLine(); // the first real data
//            }
//            while (line != null) {
//               String[] attributes = line.split(",");
//                Pyramid pyr = createPyramid(attributes);
//                pyramids.add(pyr);
//                line = br.readLine();
//            }

        
    }
            
    public Pyramid createPyramid(String []metaData){
        String pharaoh = metaData[0];
        String modern_name = metaData[2];
        String site = metaData[4];
        double height=0;
        if(metaData[7]!=null && metaData[7].length()>0)
        height= Double.parseDouble(metaData[7]);

        // create and return Pyramid of this metadata
        return new Pyramid(pharaoh, modern_name, site, height);
    
    
    
    }
}
