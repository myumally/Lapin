package croco;
import gestionnaire_animaux.*;
import lapin.*;
import agents.*;

public abstract class EtatCroco extends State{
    protected Croco croc;
    private static int nbLapinMange=0;

    public void Die(){
        Croco.getContext().addFatedToDie(croc.getId());
    }

    public void MangerUnLapin(){
        if (Lapin.getContext().getNbFatedToDie()==0){
            nbLapinMange=0;
        }
        Lapin.getContext().addFatedToDie(Lapin.getContext().getAnimaux().get(this.nbLapinMange).getId());;
        this.nbLapinMange+=1;
    }

    public abstract void GererSaison();
}
