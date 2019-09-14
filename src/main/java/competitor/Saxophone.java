package competitor;

import org.springframework.stereotype.Component;

@Component
public class Saxophone implements Instrument {

    @Override
    public void play() {
        System.out.println("Tuu tuu tuu tuu...");
    }
}
