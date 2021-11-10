package Zippopotamus.API;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public String getCountry(){
		return country;
	}

	public List<StateCityPlacesItem> getPlaces(){
		return places;
	}

	public String getState(){
		return state;
	}

	public String getStateAbbreviation(){
		return stateAbbreviation;
	}

	public String getCountryAbbreviation(){
		return countryAbbreviation;
	}

	public String getPlaceName(){
		return placeName;
	}
}