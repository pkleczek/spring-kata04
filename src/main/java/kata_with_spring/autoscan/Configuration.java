package kata_with_spring.autoscan;

import kata_with_spring.autoscan.soccer.SoccerRepository;
import kata_with_spring.autoscan.soccer.SoccerService;
import kata_with_spring.autoscan.weather.WeatherRepository;
import kata_with_spring.autoscan.weather.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by Paweł on 17.06.2017.
 */
@PropertySource("/application.properties")
@ComponentScan("kata_with_spring.autoscan.*")
public class Configuration {
}
