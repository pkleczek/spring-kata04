package kata_with_spring.autoscan;

import kata_with_spring.autoscan.soccer.SoccerService;
import kata_with_spring.autoscan.soccer.TeamStats;
import kata_with_spring.autoscan.weather.WeatherMeasurement;
import kata_with_spring.autoscan.weather.WeatherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Paweł on 17.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        SoccerService soccerService = context.getBean(SoccerService.class);
        TeamStats lowestDifference = soccerService.findLowestDifference();
        System.out.printf("%s: %d\n", lowestDifference.getName(), lowestDifference.getDifference());

        WeatherService weatherService = context.getBean(WeatherService.class);
        WeatherMeasurement lowestSpread = weatherService.findLowestSpread();
        System.out.printf("%s: %d\n", lowestSpread.getDay(), lowestSpread.getSpread());
    }
}
