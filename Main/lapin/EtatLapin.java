package lapin;
import gestionnaire_animaux.*;

public abstract class EtatLapin{
    protected Lapin lap;

    public void Die(){
        Lapin.getContext().addFatedToDie(lap.getId());
    }

    public abstract void GererSaison();
}