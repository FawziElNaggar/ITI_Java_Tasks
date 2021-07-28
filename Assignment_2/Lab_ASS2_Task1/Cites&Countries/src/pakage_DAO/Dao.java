/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage_DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FreeComp
 */
public class Dao {
    public  List<Cities> readCityFromCSV(String fileName) {
           
           List<Cities> cities = new ArrayList<>();
           //BufferedReader br = new BufferedReader(new FileReader(fileName));
           File f =new File(fileName);
           List<String> l1= new ArrayList<>();
           try{l1=Files.readAllLines(f.toPath());
           }catch(IOException e){
               System.out.println("Cannot read file");
           }
           for(int i=1;i<l1.size();i++){
            String line=l1.get(i).trim();
            String[] data=line.split(",");
            Cities obj=createCity(data);
            cities.add(obj);
        }
           return cities ;
//           String line = br.readLine();
//           if (line != null) {
//               line = br.readLine(); // the first real data
//            }
//            while (line != null) {
//               String[] attributes = line.split(",");
//               Cities city = createCity(attributes);
//               cities.add(city); 
//               line = br.readLine();
//              
//            }
            
            
    }
    public  List<Countries> readCountryFromCSV(String fileName) {
           List<Countries>countries = new ArrayList<>();
           
           List<String> l1=new ArrayList<>();
           File f =new File(fileName);
           try{l1=Files.readAllLines(f.toPath());
           }catch(IOException e){
               System.out.println("Cannot Read file");
           }
           
           for(int i=1;i<l1.size();i++){
            String line=l1.get(i).trim();
            String[] data=line.split(",");
            Countries obj=createCountry(data);
            countries.add(obj);
        }

//           BufferedReader br = new BufferedReader(new FileReader(fileName));
//           String line = br.readLine();
//           if (line != null) {
//               line = br.readLine(); // the first real data
//            }
//            while (line != null) {
//               String[] attributes = line.split(",");
//               Countries country = createCountry(attributes); 
//                countries.add(country);
//                line = br.readLine();
//            }
            return countries ;
    }
    
     public Countries createCountry(String []metaData){
        Countries obj = new Countries(metaData[0],metaData[1],metaData[2]);
        return obj ;
                }
    public Cities createCity(String []metaData){
        //boolean d4 = Boolean.parseBoolean(metaData[4]);
        Cities obj = new Cities(metaData[0].replaceAll("\"", ""),metaData[4].replaceAll("\"", ""),metaData[9].replaceAll("\"", ""),metaData[10].replaceAll("\"", ""));
        return obj ;
    }
    
    
}
