package Zippopotamus.API;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Zip code.
 */
public class ZipCode{

	@JsonProperty("country")
	private String country;

	@JsonProperty("places")
	private List<ZipPlacesItem> places;

	@JsonProperty("country abbreviation")
	private String countryAbbreviation;

	@JsonProperty("post code")
	private String postCode;

	/**
	 * Set country.
	 *
	 * @param country the country
	 */
	public void setCountry(String country){
		this.country = country;
	}

	/**
	 * Get country string.
	 *
	 * @return the string
	 */
	public String getCountry(){
		return country;
	}

	/**
	 * Set places.
	 *
	 * @param places the places
	 */
	public void setPlaces(List<ZipPlacesItem> places){
		this.places = places;
	}

	/**
	 * Get places list.
	 *
	 * @return the list
	 */
	public List<ZipPlacesItem> getPlaces(){
		return places;
	}

	/**
	 * Set country abbreviation.
	 *
	 * @param countryAbbreviation the country abbreviation
	 */
	public void setCountryAbbreviation(String countryAbbreviation){
		this.countryAbbreviation = countryAbbreviation;
	}

	/**
	 * Get country abbreviation string.
	 *
	 * @return the string
	 */
	public String getCountryAbbreviation(){
		return countryAbbreviation;
	}

	/**
	 * Set post code.
	 *
	 * @param postCode the post code
	 */
	public void setPostCode(String postCode){
		this.postCode = postCode;
	}

	/**
	 * Get post code string.
	 *
	 * @return the string
	 */
	public String getPostCode(){
		return postCode;
	}

	@Override
 	public String toString(){
		return 
			"ZipCode{" + 
			"country = '" + country + '\'' + 
			",places = '" + places + '\'' + 
			",country abbreviation = '" + countryAbbreviation + '\'' + 
			",post code = '" + postCode + '\'' + 
			"}";
		}
}