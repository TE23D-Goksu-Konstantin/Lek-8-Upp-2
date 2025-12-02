package Djurrrrr;

public class Hund extends Djur implements Dresseras
{

    public Hund()
    {
        super(5, 20000);
    }

    @Override
    public String ljud()
    {
        return "Vofff";
    }

    public void språka(String byté)
    {
        System.out.println("Språrar " + byté);
    }


    @Override
    public void kom()
    {
        System.out.println("Hunden springer mot dig");
    }

    @Override
    public void sitt()
    {
        System.out.println("Hunden sitter på dig");
    }

    @Override
    public void apport()
    {
        System.out.println("Hunden jagar efter grannen");
    }
}
