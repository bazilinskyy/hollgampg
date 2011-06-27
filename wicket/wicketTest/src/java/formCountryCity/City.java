package formCountryCity;

/**
 *
 * @author Pavlo Bazilinskyy
 */
public class City {

    public City(String cityName, Country county) {
        this.cityName = cityName;
        this.county = county;
    }

    protected String cityName;

    /**
     * Get the value of cityName
     *
     * @return the value of cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Set the value of cityName
     *
     * @param cityName new value of cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    protected Country county;

    /**
     * Get the value of county
     *
     * @return the value of county
     */
    public Country getCounty() {
        return county;
    }

    /**
     * Set the value of county
     *
     * @param county new value of county
     */
    public void setCounty(Country county) {
        this.county = county;
    }

    
}
