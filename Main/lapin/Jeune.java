package lapin;
import gestionnaire_animaux.*;

public class Jeune extends EtatLapin{

    public void GrowUp(){
        lap.setEtat(new Adult(lap));
    }

    public void GererSaison(){
        GrowUp();
    }

    public Jeune(Lapin lapinou){
        lap = lapinou;
    }
}