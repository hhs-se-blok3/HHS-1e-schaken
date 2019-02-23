import org.junit.Test;

public class StellingTest
{
    @Test
    public void test()
    {
        Speler speler0 = new Speler("WIT");
        Speler speler1 = new Speler("ZWART");
        Stelling stelling = new Stelling(speler0);
        new Koning(stelling, speler0, new Veld(1, 2));
        new Koning(stelling, speler1, new Veld(4, 6));
        new Toren(stelling, speler0, new Veld(2, 5));
        new Toren(stelling, speler1, new Veld(3, 6));
        stelling.afdrukken();
    }
}