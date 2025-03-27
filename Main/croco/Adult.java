package croco;
import lapin.*;
import java.util.Random;
import java.util.ArrayList;

public class Adult extends EtatCroco{

    public void SeReproduire(Croco croc){
        Croco.getContext().CreerCroco(croc.getX(), croc.getY());
    }

    public void GererSaison(){
        croc.grow();
        Random rand = new Random();
        Random rand2 = new Random();
        croc.grow();
        if (croc.getAge() >= 160) {
            Die();
        }
        else if (rand.nextInt(Lapin.getContext().getNbAnimaux()+10) < Lapin.getContext().getNbAnimaux()){
            MangerUnLapin();
        }
        else if (rand2.nextInt(10) < 6){
            SeReproduire(croc);
        }
    }

    public Adult(Croco crocodilou){
        this.croc = crocodilou;
    }
}
