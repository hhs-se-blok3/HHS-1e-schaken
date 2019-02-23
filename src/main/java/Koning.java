public class Koning extends Stuk
{
    public Koning(Stelling stelling, Speler van, Veld staatOp)
    {
        super(stelling, van, staatOp);
    }

    public void afdrukken()
    {
        this.getVan().afdrukken('K', 'k');
    }
}