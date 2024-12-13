package lapin;
import gestionnaire_animaux.*;
import agents.*;

public abstract class EtatLapin extends State{
    protected Lapin lap;

    public void Die(){
        Lapin.getContext().addFatedToDie(lap.getId());
    }

    public abstract void GererSaison();
}
