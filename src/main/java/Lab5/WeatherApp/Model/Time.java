package Lab5.WeatherApp.Model;

import java.util.List;

public class Time {
	
	private List<String> startPeriodName;
	private List<String> tempLabel;
	
	
	public List<String> getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public List<String> getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(List<String> tempLabel) {
		this.tempLabel = tempLabel;
	}
	@Override
	public String toString() {
		return "time [startPeriodName=" + startPeriodName + ", tempLabel=" + tempLabel + "]";
	}

}
