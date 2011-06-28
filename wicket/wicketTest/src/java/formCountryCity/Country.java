package formCountryCity;

import java.io.Serializable;

/**
 *
 * @author Pavlo Bazilinskyy
 */
//public class Country implements Serializable{
//
//    public Country(String countryCode, String countryName) {
//        this.countryCode = countryCode;
//        this.countryName = countryName;
//    }
//
//    public Country() {
//    }
//
//    protected String countryCode;
//
//    /**
//     * Get the value of countryCode
//     *
//     * @return the value of countryCode
//     */
//    public String getCountryCode() {
//        return countryCode;
//    }
//
//    /**
//     * Set the value of countryCode
//     *
//     * @param countryCode new value of countryCode
//     */
//    public void setCountryCode(String countryCode) {
//        this.countryCode = countryCode;
//    }
//
//    protected String countryName;
//
//    /**
//     * Get the value of countryName
//     *
//     * @return the value of countryName
//     */
//    public String getCountryName() {
//        return countryName;
//    }
//
//    /**
//     * Set the value of countryName
//     *
//     * @param countryName new value of countryName
//     */
//    public void setCountryName(String countryName) {
//        this.countryName = countryName;
//    }
//}

public class Country implements Serializable
{
	private final String code;
	private final String name;

	public Country(String code, String name)
	{
		this.code = code;
		this.name = name;
	}

	public String getCountryCode()
	{
		return code;
	}

	public String getCountryName()
	{
		return name;
	}
}
