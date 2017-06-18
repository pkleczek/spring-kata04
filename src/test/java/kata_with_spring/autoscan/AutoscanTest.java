package kata_with_spring.autoscan;

import kata_with_spring.autoscan.soccer.SoccerService;
import kata_with_spring.autoscan.soccer.TeamStats;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Paweł on 18.06.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuration.class)
public class AutoscanTest {
    @Autowired
    SoccerService soccerService;

    @Test
    public void contextLoads() throws Exception {
        TeamStats lowestDifference = soccerService.findLowestDifference();
        assertNotNull(lowestDifference);
    }
}