package testCompetition;

import competitor.Musician;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import static org.junit.Assert.assertEquals;
import competitor.Competitor;
import competitor.Juggler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestCompetitionTest {

    private final Logger logger = LogManager.getRootLogger();

    @Autowired
    @Qualifier("juggler")
    private Competitor juggler;

    @Autowired
    @Qualifier("reciterJuggler")
    private Competitor juggler2;

    @Autowired
    @Qualifier("jasonPiano")
    private Competitor musicianPiano;

    @Autowired
    @Qualifier("jasonSax")
    private Competitor musicianSaxophone;

    @Test
    public void testCompetitors() {
        logger.info("Inicio ejecutar Juggler");
        int ballsNumber = 10;
        juggler.run();
        assertEquals(ballsNumber,((Juggler)juggler).getBalls());
        logger.info("Fin ejecutar Juggler");

        logger.info("Inicio ejecutar Juggler");
        ballsNumber = 15;
        juggler2.run();
        assertEquals(ballsNumber,((Juggler)juggler2).getBalls());
        logger.info("Fin ejecutar ReciterJuggler");

        logger.info("Inicio ejecutar Musician Piano");
        String song = "Noche de Paz";
        musicianPiano.run();
        assertEquals(song,((Musician) musicianPiano).getSong());
        logger.info("Fin ejecutar Musician Piano");

        logger.info("Inicio ejecutar Musician Saxophone");
        song = "Equinox";
        musicianSaxophone.run();
        assertEquals(song,((Musician) musicianSaxophone).getSong());
        logger.info("Fin ejecutar Musician Saxophone");
    }
}