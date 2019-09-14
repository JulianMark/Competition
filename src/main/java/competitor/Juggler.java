package competitor;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Component("juggler")
public class Juggler implements Competitor {

    private int balls = 10;

    @Override
    public void run() throws ExecutionException {
        System.out.println("Malabareo "+ balls +" pelotas");
    }

}
