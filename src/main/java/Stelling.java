import java.util.ArrayList;

public class Stelling
{
    private Speler aanDeBeurt;
    private ArrayList<Stuk> stukken;

    public Stelling(Speler aanDeBeurt)
    {
        this.aanDeBeurt = aanDeBeurt;
        this.stukken = new ArrayList<>();
    }

    public void addStuk(Stuk stuk)
    {
        this.stukken.add(stuk);
    }

    public void afdrukken()
    {
        int row = 0;
        while (row < 8)
        {
            drukRegelAf(row);
            row = row + 1;
        }
        System.out.println();
    }

    public Stuk getStukOp(Veld veld)
    {
        Stuk result = null;
        int i = 0;
        while (i < this.stukken.size())
        {
            Stuk stuk = this.stukken.get(i);
            if (stuk.getVeld().equals(veld))
            {
                result = stuk;
            }
            i = i + 1;
        }
        return result;
    }

    public void drukRegelAf(int rij)
    {
        int kolom = 0;
        while (kolom < 8)
        {
            Stuk stuk = getStukOp(new Veld(rij, kolom));
            if (stuk == null)
            {
                System.out.print(".");
            } else
            {
                stuk.afdrukken();
            }
            kolom = kolom + 1;
        }
        System.out.println();
    }
}