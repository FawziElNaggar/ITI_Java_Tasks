/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage_DAO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author FreeComp
 */
public class MainClass {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Dao obj=new Dao();
        List<Countries> country = new ArrayList<>();
        List<Cities> city = new ArrayList<>();
        Map<String,List<String> > map =new HashMap<>(); 
        Map<String,String> COid = new HashMap<>();
        city = obj.readCityFromCSV("E:\\Java\\Projects\\cities.csv");
        country = obj.readCountryFromCSV("‪E:\\Java\\Projects\\countries.csv");
        
        
        List<Cities> sortedCities = city.stream()
            .sorted(Comparator.comparing(Cities::getPopulation))
            .collect(Collectors.toList());
        
        for(int i =0;i<country.size();i++){
            COid.put(country.get(i).getCountryName(),country.get(i).getCountyID());
        }
        
        for(int i =0;i<sortedCities.size();i++){
             map.putIfAbsent(COid.get(sortedCities.get(i).getCountry()), new ArrayList<>());
             map.get(COid.get(sortedCities.get(i).getCountry())).add(sortedCities.get(i).getName());
        }
        map.forEach((key,value)->System.out.println("| Code: "+key+"| List Of Cities: "+value));
    }   
    
    
}

