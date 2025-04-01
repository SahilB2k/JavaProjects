package Weather;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherResponseParser {

    public void parseAndPrint(String jsonResponse){
        JSONObject jsonObject=new JSONObject(jsonResponse);

        if(jsonObject.getInt("cod")==200){
            System.out.println("Weather forecast for city:");
            JSONArray forecasts=jsonObject.getJSONArray("list");
            for(int i=0;i<forecasts.length();i++){
                JSONObject forecast =forecasts.getJSONObject(i);
                long timestapm = forecast.getLong("dt");
                String date=new SimpleDateFormat("yyy-MM-dd").format(new Date(timestapm*1000));
                double temparature =forecast.getJSONObject("main").getDouble("temp");
                double humidity =forecast.getJSONObject("main").getDouble("humidity");
                String description =forecast.getJSONArray("weather").getJSONObject(0).getString("description");
                System.out.println(date +": "+humidity+": "+ temparature + "C, "+description);}
        }else{
            System.out.println("Request contains an error!");
        }
    }
}
