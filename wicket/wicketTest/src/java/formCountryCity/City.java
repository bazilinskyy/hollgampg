package formCountryCity;

/**
 *
 * @author Pavlo Bazilinskyy
 */
public class City {

    public City(String cityName, String countyCode) {
        this.cityName = cityName;
        this.countryCode = countryCode;
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
    protected String countryCode;

    /**
     * Get the value of countryCode
     *
     * @return the value of countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Set the value of countryCode
     *
     * @param countryCode new value of countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
