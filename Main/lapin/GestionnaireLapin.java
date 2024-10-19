package lapin;
import gestionnaire_animaux.*;

public class GestionnaireLapin extends GestionnaireAnimaux{

    public Lapin CreerLapin(){
        this.nbAnimaux+=1;
        Lapin lap=new Lapin();
        lap.setEtat(new Jeune(lap));
        lap.setContext(this);
        this.addAnimaux((Animaux)lap);
        return lap;
    }
}