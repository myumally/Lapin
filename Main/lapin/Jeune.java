package lapin;
import gestionnaire_animaux.*;

public class Jeune extends EtatLapin{

    public void GererSaison(){
        lap.setEtat(new Adult(lap));
    }

    public Jeune(Lapin lapinou){
        lap = lapinou;
    }
}