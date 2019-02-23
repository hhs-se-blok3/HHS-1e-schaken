public abstract class Stuk
{
    private Stelling stelling;
    private Speler van;
    private Veld staatOp;

    public Stuk(Stelling stelling, Speler van, Veld staatOp)
    {
        this.stelling = stelling;
        this.van = van;
        this.staatOp = staatOp;
        stelling.addStuk(this);
    }

    public abstract void afdrukken();

    public Speler getVan()
    {
        return this.van;
    }

    public Veld getVeld()
    {
        return this.staatOp;
    }

}
