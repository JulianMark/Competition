package competitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Component("reciterJuggler")
public class ReciterJuggler extends Juggler {

    private Poem poem;

    @Autowired
    public ReciterJuggler(@Value("15") int balls, Poem poem) {
        super(balls);
        this.poem = poem;
    }

    @Override
    public void run(){
        super.run();
        System.out.println("Mientras recita");
        poem.recite();
        System.out.println("Termina recitación...");
    }
}
