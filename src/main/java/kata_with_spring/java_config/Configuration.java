package kata_with_spring.java_config;

import kata_with_spring.java_config.soccer.SoccerRepository;
import kata_with_spring.java_config.soccer.SoccerService;
import kata_with_spring.java_config.weather.WeatherRepository;
import kata_with_spring.java_config.weather.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
public class Configuration {
    @Autowired
    Environment env;

    @Bean
    public SoccerService soccerService(SoccerRepository soccerRepository) {
        SoccerService soccerService = new SoccerService();
        soccerService.setSoccerRepository(soccerRepository);
        return soccerService;
    }

    @Bean
    SoccerRepository soccerRepository() throws IOException {
        SoccerRepository repository = new SoccerRepository();
        ClassPathResource resource = new ClassPathResource(env.getProperty("football.location"));
        repository.setSoccerData(Paths.get(resource.getURI()));
        return repository;
    }

    @Bean
    @Scope(value = "prototype")
    WeatherService weatherService() throws IOException {
        WeatherService weatherService = new WeatherService();
        WeatherRepository weatherRepository = new WeatherRepository();
        ClassPathResource resource = new ClassPathResource(env.getProperty("weather.location"));
        weatherRepository.setWeatherData(Paths.get(resource.getURI()));
        weatherService.setWeatherRepository(weatherRepository);
        return weatherService;


    }
}
