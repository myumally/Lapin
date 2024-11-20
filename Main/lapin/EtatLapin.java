package lapin;
import gestionnaire_animaux.*;

public abstract class EtatLapin{
    protected Lapin lap;

    public void Die(){
        lap.getContext().removeAnimaux(lap.getId());
    }

    public abstract void GererSaison();
}