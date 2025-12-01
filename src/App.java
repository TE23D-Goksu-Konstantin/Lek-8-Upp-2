import Djurrrrr.Djur;
import Djurrrrr.Katt;
import Djurrrrr.Mus;
import Djurrrrr.Hund;

public class App {
    public static void main(String[] args)
    {
        Djur[] djurfält = new Djur[6];

        djurfält[0] = new Katt();
        djurfält[1] = new Katt();
        djurfält[2] = new Hund();
        djurfält[3] = new Hund();
        djurfält[4] = new Mus();
        djurfält[5] = new Hund();

        for(Djur djur: djurfält)
            {
                System.out.println(djur.ljud());
                
                if(djur instanceof Katt katt)
                    {
                        katt.leka("boll");
                    }
                                
                if(djur instanceof Hund hund)
                    {
                        hund.språka("människa");
                        hund.apport();
                        hund.kom();
                        hund.sitt();
                    }
                                
                if(djur instanceof Mus mus)
                    {
                        mus.klättra();
                    }
            }
        }
    }

