package Zippopotamus.API;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type State city places item.
 */
public class StateCityPlacesItem {

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("post code")
	private String postCode;

	@JsonProperty("place name")
	private String placeName;

	@JsonProperty("longitude")
	private String longitude;

	/**
	 * Get latitude string.
	 *
	 * @return the string
	 */
	public String getLatitude(){
		return latitude;
	}

	/**
	 * Get post code string.
	 *
	 * @return the string
	 */
	public String getPostCode(){
		return postCode;
	}

	/**
	 * Get place name string.
	 *
	 * @return the string
	 */
	public String getPlaceName(){
		return placeName;
	}

	/**
	 * Get longitude string.
	 *
	 * @return the string
	 */
	public String getLongitude(){
		return longitude;
	}
}