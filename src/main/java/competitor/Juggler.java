package competitor;

public class Juggler implements Competitor {

    private int balls = 5;

    public Juggler (){}

    public Juggler (int balls){
        this.balls = balls;
    }
    @Override
    public void run() throws EjecutionException {
        System.out.println("Malabareo "+ balls +" pelotas");
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }
}
