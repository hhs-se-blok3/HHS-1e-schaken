import java.util.ArrayList;

public class Stelling
{
    private Speler aanDeBeurt;
    private ArrayList<Koning> koningen;
    private ArrayList<Toren> torens;

    public Stelling(Speler aanDeBeurt)
    {
        this.aanDeBeurt = aanDeBeurt;
        this.koningen = new ArrayList<>();
        this.torens = new ArrayList<>();
    }

    public void addKoning(Koning koning)
    {
        this.koningen.add(koning);
    }

    public void addToren(Toren toren)
    {
        this.torens.add(toren);
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

    public Koning getKoningOp(Veld veld)
    {
        Koning result = null;
        int i = 0;
        while (i < this.koningen.size())
        {
            Koning koning = this.koningen.get(i);
            if (koning.getVeld().equals(veld))
            {
                result = koning;
            }
            i = i + 1;
        }
        return result;
    }

    public Toren getTorenOp(Veld veld)
    {
        Toren result = null;
        int i = 0;
        while (i < this.torens.size())
        {
            Toren toren = this.torens.get(i);
            if (toren.getVeld().equals(veld))
            {
                result = toren;
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
            Koning koning = getKoningOp(new Veld(rij, kolom));
            if (koning == null)
            {
                Toren toren = getTorenOp(new Veld(rij, kolom));
                if (toren == null)
                {

                    System.out.print(".");

                } else
                {
                    toren.afdrukken();
                }
            } else
            {
                koning.afdrukken();
            }
            kolom = kolom + 1;
        }
        System.out.println();
    }
}
