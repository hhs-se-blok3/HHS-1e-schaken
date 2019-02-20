import org.junit.Test;

public class StellingTest
{
    @Test
    public void test()
    {
        Speler speler0 = new Speler(0);
        Speler speler1 = new Speler(1);
        Stelling stelling = new Stelling(speler0);
        stelling.addKoning(new Koning(speler0, new Veld(1, 2)));
        stelling.addKoning(new Koning(speler1, new Veld(4, 6)));
        stelling.addToren(new Toren(speler0, new Veld(2, 5)));
        stelling.addToren(new Toren(speler1, new Veld(3, 6)));
        stelling.afdrukken();
    }
}
