package Zippopotamus.API;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type State city.
 */
public class StateCity {

	@JsonProperty("country")
	private String country;

	@JsonProperty("places")
	private List<StateCityPlacesItem> places;

	@JsonProperty("state")
	private String state;

	@JsonProperty("state abbreviation")
	private String stateAbbreviation;

	@JsonProperty("country abbreviation")
	private String countryAbbreviation;

	@JsonProperty("place name")
	private String placeName;

	/**
	 * Get country string.
	 *
	 * @return the string
	 */
	public String getCountry(){
		return country;
	}

	/**
	 * Get places list.
	 *
	 * @return the list
	 */
	public List<StateCityPlacesItem> getPlaces(){
		return places;
	}

	/**
	 * Get state string.
	 *
	 * @return the string
	 */
	public String getState(){
		return state;
	}

	/**
	 * Get state abbreviation string.
	 *
	 * @return the string
	 */
	public String getStateAbbreviation(){
		return stateAbbreviation;
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
	 * Get place name string.
	 *
	 * @return the string
	 */
	public String getPlaceName(){
		return placeName;
	}
}