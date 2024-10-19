package lapin;
import gestionnaire_animaux.*;

public class Lapin extends Animaux{
    private EtatLapin etat;

    private static GestionnaireLapin context;

    public void setEtat(EtatLapin et){
        etat=et;
    }

    public EtatLapin getEtat(){
        return etat;
    }

    public static void setContext(GestionnaireLapin ges){
        context=ges;
    }

    public static GestionnaireLapin getContext(){
        return context;
    }

    public void GererSaison(){
        etat.GererSaison();
    }
}