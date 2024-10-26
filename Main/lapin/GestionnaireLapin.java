package lapin;
import gestionnaire_animaux.*;

public class GestionnaireLapin extends GestionnaireAnimaux{

    public Lapin CreerLapin(){
        //this.nbAnimaux+=1;
        Lapin lap=new Lapin();
        lap.setEtat(new Jeune(lap));
        this.addNewAnimaux((Animaux)lap);
        return lap;
    }

    public GestionnaireLapin(){
        this.type="Lapin";
    }
}