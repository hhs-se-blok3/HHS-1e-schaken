public class Veld
{
    private int rij;
    private int kolom;

    public Veld(int rij, int kolom)
    {
        this.rij = rij;
        this.kolom = kolom;
    }


    public boolean equals(Veld that)
    {
        return this.rij == that.rij && this.kolom == that.kolom;
    }
}
