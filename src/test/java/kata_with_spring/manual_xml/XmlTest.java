package kata_with_spring.manual_xml;

import kata_with_spring.manual_xml.soccer.SoccerService;
import kata_with_spring.manual_xml.soccer.TeamStats;
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
@ContextConfiguration("/manual-context.xml")
public class XmlTest {
    @Autowired
    SoccerService soccerService;

    @Test
    public void contextLoads() throws Exception {
        TeamStats lowestDifference = soccerService.findLowestDifference();
        assertNotNull(lowestDifference);
    }
}