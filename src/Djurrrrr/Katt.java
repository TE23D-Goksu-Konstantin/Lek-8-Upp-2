package Djurrrrr;

public class Katt extends Djur
{
 
    public Katt()
    {
        super(3, 10000);
    }

    @Override
    public String ljud()
    {
        return "Meooowwww";
    }

    public void leka(String sak)
    {
        System.out.println("Leker med " + sak);
    }
}
