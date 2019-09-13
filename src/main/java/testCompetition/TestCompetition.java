package testCompetition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import competitor.Competitor;

public class TestCompetition {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Competitor juggler = (Competitor) context.getBean("juggler");
        juggler.run();
    }
}
