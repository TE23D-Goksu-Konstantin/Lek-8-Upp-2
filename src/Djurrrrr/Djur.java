package Djurrrrr;
public abstract class Djur 
{
    protected int vikt;
    protected int energi;
    protected boolean lever;
    private int antal_djur = 0;

    public Djur(int vikt, int energi)
    {
        this.vikt = vikt;
        this.energi = energi;
        this.lever = true;
        antal_djur++;
    }





    public void äta(int energi)
    {
        energi++;
    }

    public void spring(int meter)
    {
        energi = energi - vikt*meter;

        if(energi > 0)
            {
                lever = false;
            }
    }

    public abstract String ljud();


    public interface dresseras
    {
        public void sitt();
        public void apport();
        public void kom();
    }


    
}
