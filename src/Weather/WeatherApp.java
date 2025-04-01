package Weather;
import java.util.Scanner;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class WeatherApp {

    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What City would you like to see the weather forecast??");
        System.out.print("City: ");
        String city = scanner.nextLine().trim();

        if (!city.isEmpty()) {
            try {
                String forecastingString = api.getForecaast(city);

                if (forecastingString == null || forecastingString.isEmpty()) {
                    System.out.println("Incorrect city name! Please enter a valid city.");
                } else {
                    WeatherResponseParser parser = new WeatherResponseParser();
                    parser.parseAndPrint(forecastingString);
                }
            } catch (IOException e) {
                System.out.println("Error fetching weather data. Please check the city name and try again.");
            }
        } else {
            System.out.println("Enter a valid City name!!");
        }
    }
}