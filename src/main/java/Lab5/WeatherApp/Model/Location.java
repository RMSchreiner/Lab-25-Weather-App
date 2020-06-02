package Lab5.WeatherApp.Model;

public class Location {
    
	private String areaDescription;

	public String getAreaDescription() {
		return areaDescription;
	}
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;	
	}
	@Override
	public String toString() {
		return "Location [areaDescription=" + areaDescription + "]";
	}
	
}
