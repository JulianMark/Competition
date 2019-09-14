package competitor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Juggler implements Competitor {

    private int balls = 5;

    @Override
    public void run() throws ExecutionException {
        System.out.println("Malabareo "+ balls +" pelotas");
    }

}
