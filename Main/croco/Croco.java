package croco;
import gestionnaire_animaux.*;

public class Croco extends Animaux{
    private EtatCroco etat;

    private static GestionnaireCroco context;

    public void setEtat(EtatCroco et){
        etat=et;
    }

    public EtatCroco getEtat(){
        return etat;
    }

    public static void setContext(GestionnaireCroco ges){
        context=ges;
    }

    public static GestionnaireCroco getContext(){
        return context;
    }

    public void GererSaison(){
        etat.GererSaison();
    }
}