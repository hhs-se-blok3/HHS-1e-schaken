public class Koning
{
    private Speler van;
    private Veld staatOp;

    public Koning(Speler van, Veld staatOp)
    {
        this.van = van;
        this.staatOp = staatOp;
    }

    public void afdrukken()
    {
      this.van.afdrukken('K', 'k');
    }

    public Veld getVeld()
    {
        return this.staatOp;
    }
}
