package Lab5.WeatherApp.Model;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherApiService {
	
	private  RestTemplate rest = new RestTemplate();
	
	public WeatherForcast getForcast (String lat, String lon){
		String url = "https://forecast.weather.gov/MapClick.php?lat=" + lat + "&lon=" + lon + "&FcstType=json";
		
		WeatherForcast forcast = rest.getForObject(url, WeatherForcast.class, lat, lon);	
		
		return  forcast;
}
	
	
}



