package Zippopotamus.API;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateCityPlacesItem {

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("post code")
	private String postCode;

	@JsonProperty("place name")
	private String placeName;

	@JsonProperty("longitude")
	private String longitude;

	public String getLatitude(){
		return latitude;
	}

	public String getPostCode(){
		return postCode;
	}

	public String getPlaceName(){
		return placeName;
	}

	public String getLongitude(){
		return longitude;
	}
}