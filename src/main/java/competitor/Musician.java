package competitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Component("jasonPiano")
public class Musician implements Competitor {

    @Value("Noche de Paz")
    private String song;

    @Autowired
    @Qualifier("piano")
    private Instrument instrument;

    @Override
    public void run() throws ExecutionException {
        System.out.println("Tocando "+ song +":");
        instrument.play();
    }
}
