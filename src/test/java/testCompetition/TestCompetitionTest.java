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
    private Competitor juggler2;

    @Before
    public void before (){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        juggler = (Competitor) context.getBean("juggler");
        juggler2 = (Competitor) context.getBean("reciterJuggler");
    }

    @Test
    public void testJuggler() {
        log.info("Inicio ejecutar Juggler");

        int ballsNumber = 10;
        juggler.run();

        assertEquals(ballsNumber,((Juggler)juggler).getBalls());

        log.info("Fin ejecutar Juggler");

        ballsNumber = 15;
        juggler2.run();

        assertEquals(ballsNumber,((Juggler)juggler2).getBalls());

        log.info("Fin ejecutar ReciterJuggler");
    }
}