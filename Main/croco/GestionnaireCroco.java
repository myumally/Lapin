package croco;
import gestionnaire_animaux.*;

public class GestionnaireCroco extends GestionnaireAnimaux{

    public Croco CreerCroco(int x, int y){
        Croco croc=new Croco();
        croc.setEtat(new Jeune(croc));
        croc.setId(this.nbAnimaux+this.nbNewAnimaux+1);
        croc.setX(x);
        croc.setY(y);
        this.addNewAnimaux((Animaux)croc);
        return croc;
    }

    public GestionnaireCroco(){
        this.type="Croco";
    }
}
