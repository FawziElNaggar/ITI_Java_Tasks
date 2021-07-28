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
public class Cities {
    private String cID;
    private String country;
    private String name;
    private String population;
    private boolean capital;
   

    public Cities(String cID, String country, String name, String population ) {
        this.cID = cID;
        this.country = country;
        this.name = name;
        this.population = population;
       // this.capital = capital;
        
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String cuntryID) {
        this.country = cuntryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
     public boolean isCapital() {
        return this.capital;
    }

    public boolean getCapital() {
        return this.capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }
     


    
    
}
