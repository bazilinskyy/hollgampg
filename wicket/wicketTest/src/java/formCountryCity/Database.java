/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formCountryCity;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Pavlo Bazilinskyy
 */
public class Database {

    public static List<Country> getCountries() {
        Country country1 = new Country("UK", "gb");
        Country country2 = new Country("Germany", "d");
        
        return Arrays.asList(new Country[]{country1, country2});
    }
    
    public static List<City> getCities(String countryCode) {
        List<Country> listCountries= getCountries();
        
        return Arrays.asList(new City[]{
            new City("London", listCountries.get(0)),
            new City("London", listCountries.get(0)),
            new City("Berlin", listCountries.get(1)),
            new City("Dresden", listCountries.get(1))
        });
    }
}
