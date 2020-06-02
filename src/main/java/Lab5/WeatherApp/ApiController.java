package Lab5.WeatherApp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Lab5.WeatherApp.Model.Currentobservation;
import Lab5.WeatherApp.Model.Data;
import Lab5.WeatherApp.Model.Location;
import Lab5.WeatherApp.Model.Time;
import Lab5.WeatherApp.Model.WeatherApiService;
import Lab5.WeatherApp.Model.WeatherForcast;


@Controller
public class ApiController {
	
	
	@Autowired
	private WeatherApiService forcast;
	
	
	
	@RequestMapping("/home")
	public String weatherHome(String lat, String lon, Model model) {
		
		lat ="42.3831";
		lon="-83.1022";
		WeatherForcast weatherForcast=forcast.getForcast(lat, lon);
		
		Data data = weatherForcast.getData();
		Time time = weatherForcast.getTime();
		Location location = weatherForcast.getLocation();
		Currentobservation currentobservation = weatherForcast.getCurrentobservation();
		List<String> temperature = data.getTemperature();
		List<String> days = time.getStartPeriodName();
		List<String> highL = time.getTempLabel();
		String area = location.getAreaDescription();
		List<String> summary = data.getWeather();
		List<String> text = data.getText();
		
		model.addAttribute("text", text);
		model.addAttribute("summary", summary);
		model.addAttribute("area",area);
		model.addAttribute("highL",highL);
		model.addAttribute("days", days);		
		model.addAttribute("temperature", temperature);
		model.addAttribute("data", data);
		model.addAttribute("time",time);
		model.addAttribute("location",location);
		model.addAttribute("currentobservation",currentobservation);
		
		System.out.print(data.toString());
		System.out.print(time.toString());
		System.out.print(location.toString());
		System.out.print(currentobservation.toString());
		
		
		model.addAttribute("weatherforcast",weatherForcast);
		return "home";
	}
}
