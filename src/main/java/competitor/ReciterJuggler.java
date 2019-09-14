package competitor;

public class ReciterJuggler extends Juggler {

    private Poem poem;

    public ReciterJuggler(int balls, Poem poem) {
        super(balls);
        this.poem = poem;
    }

    public ReciterJuggler(Poem poem) {
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
