package Lab5.WeatherApp.Model;


public class Currentobservation {

	private int Temp;
	private int Dewp;
	private int Relh;
	private int Winds;
	private int Windd;
	private int Weather;
	public int getTemp() {
		return Temp;
	}
	public void setTemp(int temp) {
		Temp = temp;
	}
	public int getDewp() {
		return Dewp;
	}
	public void setDewp(int dewp) {
		Dewp = dewp;
	}
	public int getRelh() {
		return Relh;
	}
	public void setRelh(int relh) {
		Relh = relh;
	}
	public int getWinds() {
		return Winds;
	}
	public void setWinds(int winds) {
		Winds = winds;
	}
	public int getWindd() {
		return Windd;
	}
	public void setWindd(int windd) {
		Windd = windd;
	}
	public int getWeather() {
		return Weather;
	}
	public void setWeather(int weather) {
		Weather = weather;
	}
	@Override
	public String toString() {
		return "Currentobservation [Temp=" + Temp + ", Dewp=" + Dewp + ", Relh=" + Relh + ", Winds=" + Winds
				+ ", Windd=" + Windd + ", Weather=" + Weather + "]";
	}
}

