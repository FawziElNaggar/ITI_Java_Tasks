/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage_DAO;

/**
 *
 * @author FreeComp
 */
public class Countries {
    private String countyID;
    private String countryName ;
    private String continent ;

    public Countries(String countyID, String countryName, String continent) {
        this.countyID = countyID;
        this.countryName = countryName;
        this.continent = continent;
    }

    public String getCountyID() {
        return countyID;
    }

    public void setCountyID(String countyID) {
        this.countyID = countyID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Countries{" + "countyID=" + countyID + ", countryName=" + countryName + ", continent=" + continent + '}';
    }
    
    
    
    
}
