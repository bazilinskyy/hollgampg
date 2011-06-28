/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formCountryCity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pavlo Bazilinskyy
 */
//public class Database {
//
//    public static List<Country> getCountries() {
//        Country country1 = new Country("UK", "gb");
//        Country country2 = new Country("Germany", "d");
//        
//        return Arrays.asList(new Country[]{country1, country2});
//    }
//    
//    public static List<City> getCities(String countryCode) {
//        List<Country> listCountries= getCountries();
//        
//        return Arrays.asList(new City[]{
//            new City("London", listCountries.get(0).getCountryCode()),
//            new City("London", listCountries.get(0).getCountryCode()),
//            new City("Berlin", listCountries.get(1).getCountryCode()),
//            new City("Dresden", listCountries.get(1).getCountryCode())
//        });
//    }
//}


public class Database
{
	private static final String COUNTRIES = "USA,United States of America,D,Germany,F,France,GB,Great Britain";
	private static final String CITIES = "USA,NY,New York,USA,CL,Cleveland,USA,AU,Austin,USA,LA,Los Angeles,D,BE,Berlin,D,BO,Bonn,F,PA,Paris,F,NI,Nice,GB,LO,London,GB,GL,Glasgow,GB,LI,Liverpool";

	public static List<Country> getCountries()
	{
		List<Country> countries = new ArrayList<Country>();

		String[] parts = COUNTRIES.split(",");
		for (int i = 0; i < parts.length / 2; i++)
		{
			Country country = new Country(parts[i * 2], parts[i * 2 + 1]);
			countries.add(country);
		}
		return countries;
	}

	public static List<City> getCities(String countryCode)
	{
		List<City> cities = new ArrayList<City>();
		String[] parts = CITIES.split(",");
		for (int i = 0; i < parts.length / 3; i++)
		{
			String code= parts[i * 3];
			if (code.equals(countryCode))
			{
				City city = new City(parts[i * 3 + 1], parts[i * 3 + 2]);
				cities.add(city);
			}
		}
		return cities;
	}
}
