package croco;
import gestionnaire_animaux.*;

public class GestionnaireCroco extends GestionnaireAnimaux{

    public Croco CreerCroco(){
        this.nbAnimaux+=1;
        Croco croc=new Croco();
        croc.setEtat(new Jeune(croc));
        Croco.setContext(this);
        this.addAnimaux((Animaux)croc);
        return croc;
    }
}