package Djurrrrr;

public class Mus extends Djur
{
    public Mus()
    {
        super(1, 5000);
    }


    @Override
    public String ljud()
    {
        return "Piiiiip";
    }

    public void klättra()
    {
        System.out.println("Musen klättrar");
    }
}
