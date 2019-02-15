import java.util.ArrayList;

public class Stelling {
    private Speler aanDeBeurt;
    private ArrayList<Koning> bestaatUitKoningen;
    private ArrayList<Toren> bestaatUitTorens;

    public Stelling(Speler aanDeBeurt, ArrayList<Koning> bestaatUitKoningen, ArrayList<Toren> bestaatUitTorens) {
        this.aanDeBeurt = aanDeBeurt;
        this.bestaatUitKoningen = bestaatUitKoningen;
        this.bestaatUitTorens = bestaatUitTorens;
    }
}
