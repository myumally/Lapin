package croco;
import gestionnaire_animaux.*;
import lapin.*;
import agents.*;

public abstract class EtatCroco extends State{
    protected Croco croc;
    private static int nbLapinMange=0;

    public static void ResetNbLapinMange(){
        nbLapinMange = 0;
    }

    public void Die(){
        Croco.getContext().addFatedToDie(croc.getId());
    }

    public void MangerUnLapin(){
        if(nbLapinMange < Lapin.getContext().getNbAnimaux()){
            Lapin.getContext().addFatedToDie(Lapin.getContext().getAnimaux().get(this.nbLapinMange).getId());
            nbLapinMange+=1;
        }
    }

    public abstract void GererSaison();
}
