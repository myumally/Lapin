package croco;
import gestionnaire_animaux.*;

public abstract class EtatCroco{
    protected Croco croc;

    public void Die(){
        croc.getContext().removeAnimaux(croc.getId());
    }

    public abstract void GererSaison();
}