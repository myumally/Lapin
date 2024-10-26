package croco;
import java.util.Random;
import lapin.*;


public class Jeune extends EtatCroco{

    private void MangerUnLapin(){
        Lapin.getContext().removeAnimaux(0);
    }

    public void GererSaison(){
        Random rand = new Random();
        if(rand.nextInt(Lapin.getContext().getNbAnimaux()+10) < Lapin.getContext().getNbAnimaux()){
            MangerUnLapin();
        }
    }

    public Jeune(Croco crocodilou){
        croc = crocodilou;
    }
}