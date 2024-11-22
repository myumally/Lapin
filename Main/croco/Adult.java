package croco;
import lapin.*;
import java.util.Random;
import java.util.ArrayList;

public class Adult extends EtatCroco{

    public void SeReproduire(){
        Croco.getContext().CreerCroco();
    }

    public void GererSaison(){
        croc.grow();
        Random rand = new Random();
        Random rand2 = new Random();
        croc.grow();
        if(rand.nextInt(Lapin.getContext().getNbAnimaux()+10) < Lapin.getContext().getNbAnimaux()){
            MangerUnLapin();
        }
        else if((croc.getAge()<50) && (rand2.nextInt(10)<6)){
            SeReproduire();
        }
        else{
            Die();
        }
    }

    public Adult(Croco crocodilou){
        this.croc = crocodilou;
    }
}