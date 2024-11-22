package croco;
import java.util.Random;
import lapin.*;


public class Jeune extends EtatCroco{

    public void GrowUp(){
        croc.setEtat(new Adult(croc));
    }


    public void GererSaison(){
        croc.grow();
        Random rand = new Random();
        if (croc.getAge()==2){
            GrowUp();
        }
        else if(rand.nextInt(Lapin.getContext().getNbAnimaux()+10) < Lapin.getContext().getNbAnimaux()){
            MangerUnLapin();
        }
    }

    public Jeune(Croco crocodilou){
        croc = crocodilou;
    }
}