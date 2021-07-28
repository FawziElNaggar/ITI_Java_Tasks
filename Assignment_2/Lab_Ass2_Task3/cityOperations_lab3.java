///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package pakage_DAO;
//
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//
///**
// *
// * @author FreeComp
// */
public class cityOperations_lab3 {
    
    Dao cityDAO = new Dao();
        List<Cities> cities;

    public cityOperations_lab3() throws IOException {
        this.cities = cityDAO.readCityFromCSV("E:\\Java\\Projects\\cities.csv");
    }
    public Map<String,Object> highestPopulationCountry(List<Cities> cities) {
        
        return cities.stream().collect(Collectors.groupingBy(Cities::getCountry, Collectors.maxBy(Comparator.comparingInt( Cities::getPopulation))));
    }

    public Map<String,Object> highestPopulationContinent(List<Countries> countrieses) {
        
        return countrieses.stream().collect(Collectors.groupingBy(Countries::getContinent, Collectors.maxBy(Comparator.comparingInt(Cities::getPopulation))));
    }

    public Map<String,Object> highestPopulationCapital(List<Cities> cities) {
        
        return cities.stream().collect(Collectors.groupingBy(Cities::isCapital,Collectors.maxBy(Comparator.comparingInt(Cities::getPopulation))));
    }

}
