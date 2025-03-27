package lapin;
import gestionnaire_animaux.*;

public class GestionnaireLapin extends GestionnaireAnimaux{

    public Lapin CreerLapin(int x, int y){
        Lapin lap=new Lapin();
        lap.setEtat(new Jeune(lap));
        lap.setId(this.nbAnimaux+this.nbNewAnimaux+1);
        lap.setX(x);
        lap.setY(y);
        this.addNewAnimaux((Animaux)lap);
        return lap;
    }

    public GestionnaireLapin(){
        this.type="Lapin";
    }
}
