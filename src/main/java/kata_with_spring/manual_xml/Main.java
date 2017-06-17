package kata_with_spring.manual_xml;

import kata_with_spring.manual_xml.soccer.SoccerService;
import kata_with_spring.manual_xml.soccer.TeamStats;
import kata_with_spring.manual_xml.weather.WeatherMeasurement;
import kata_with_spring.manual_xml.weather.WeatherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Paweł on 17.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/manual-context.xml");
        SoccerService soccerService = context.getBean(SoccerService.class);
        TeamStats lowestDifference = soccerService.findLowestDifference();
        System.out.printf("%s: %d\n", lowestDifference.getName(), lowestDifference.getDifference());

        WeatherService weatherService = context.getBean(WeatherService.class);
        WeatherMeasurement lowestSpread = weatherService.findLowestSpread();
        System.out.printf("%s: %d\n", lowestSpread.getDay(), lowestSpread.getSpread());
    }
}
