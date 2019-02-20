public class Speler
{
    private int kleur;

    public Speler(int kleur)
    {
        this.kleur = kleur;
    }

    public void afdrukken(char symboolWit, char symboolZwart)
    {
        if (this.kleur == 0)
        {
            System.out.print(symboolWit);
        }
        else
        {
            System.out.print(symboolZwart);
        }
    }

}
