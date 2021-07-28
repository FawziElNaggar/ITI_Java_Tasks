
package file.handling.and.data.extraction;

import java.util.List;

public class FileHandlingAndDataExtraction {


    public static void main(String[] args)  {
        ExplorAllData data = new ExplorAllData();
        data.load_data();
        
        
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("‪E:\\Java\\pyramids.csv");
        
        for(int i=0 ; pyramids.size()>i ; i++){
            System.out.println("number" + i + pyramids.get(i));
        }
//        for(Pyramid p:pyramids)
//        {
//            System.out.println("number"+(i++)+p);
//        }
    }
        
}
