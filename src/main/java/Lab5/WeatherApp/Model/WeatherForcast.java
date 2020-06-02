package Lab5.WeatherApp.Model;

public class WeatherForcast {

	private Location location;
	private Time time;
	private Data data;
	private Currentobservation currentobservation;
	
	
	public Location getLocation() {
		return location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Currentobservation getCurrentobservation() {
		return currentobservation;
	}
	public void setCurrentobservation(Currentobservation currentobservation) {
		this.currentobservation = currentobservation;
	}
	@Override
	public String toString() {
		return "WeatherForcast [location=" + location + ", time=" + time + ", data=" + data + ", currentobservation="
				+ currentobservation + "]";
	}
}
