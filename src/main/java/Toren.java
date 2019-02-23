public class Toren extends Stuk
{
    public Toren(Stelling stelling, Speler van, Veld staatOp)
    {
        super(stelling, van, staatOp);
    }

    public void afdrukken()
    {
        this.getVan().afdrukken('R', 'r');
    }
}