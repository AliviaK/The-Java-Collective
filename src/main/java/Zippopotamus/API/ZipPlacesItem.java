package Zippopotamus.API;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Zip places item.
 */
public class ZipPlacesItem {

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("state")
	private String state;

	@JsonProperty("state abbreviation")
	private String stateAbbreviation;

	@JsonProperty("place name")
	private String placeName;

	@JsonProperty("longitude")
	private String longitude;

	/**
	 * Set latitude.
	 *
	 * @param latitude the latitude
	 */
	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	/**
	 * Get latitude string.
	 *
	 * @return the string
	 */
	public String getLatitude(){
		return latitude;
	}

	/**
	 * Set state.
	 *
	 * @param state the state
	 */
	public void setState(String state){
		this.state = state;
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
	 * Set state abbreviation.
	 *
	 * @param stateAbbreviation the state abbreviation
	 */
	public void setStateAbbreviation(String stateAbbreviation){
		this.stateAbbreviation = stateAbbreviation;
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
	 * Set place name.
	 *
	 * @param placeName the place name
	 */
	public void setPlaceName(String placeName){
		this.placeName = placeName;
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
	 * Set longitude.
	 *
	 * @param longitude the longitude
	 */
	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	/**
	 * Get longitude string.
	 *
	 * @return the string
	 */
	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"erik---PlacesItem{" +
			"latitude = '" + latitude + '\'' + 
			",state = '" + state + '\'' + 
			",state abbreviation = '" + stateAbbreviation + '\'' + 
			",place name = '" + placeName + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}