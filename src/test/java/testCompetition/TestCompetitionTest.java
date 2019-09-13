package testCompetition;

import org.junit.Test;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.assertEquals;
import competitor.Competitor;
import competitor.Juggler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class TestCompetitionTest {

    Logger log = LogManager.getRootLogger();
    private Competitor juggler;

    @Before
    public void before (){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        juggler = (Competitor) context.getBean("juggler");
    }

    @Test
    public void testJuggler() {
        log.info("Inicio ejecutar Juggler");

        int ballsNumber = 5;
        juggler.run();

        assertEquals(ballsNumber,((Juggler)juggler).getBalls());

        log.info("Fin ejecutar Juggler");
    }
}