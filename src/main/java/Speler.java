public class Speler
{
    private String kleur;

    public Speler(String kleur)
    {
        this.kleur = kleur;
    }

    public void afdrukken(char symboolWit, char symboolZwart)
    {
        if (this.kleur == "WIT")
        {
            System.out.print(symboolWit);
        } else
        {
            System.out.print(symboolZwart);
        }
    }

}
