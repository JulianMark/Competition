package competitor;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {

    @Override
    public void play() {
        System.out.println("Clin clin clin clin ...");
    }
}
