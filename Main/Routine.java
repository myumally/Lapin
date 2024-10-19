import lapin.*;
import croco.*;
import gestionnaire_animaux.*;
import bateau.*;

import java.util.ArrayList;

public class Routine{
    protected int nbGestionnaires;
    protected ArrayList<GestionnaireAnimaux> gestionnaires = new ArrayList<GestionnaireAnimaux>();

    public int getNbGestionnaires(){
        return nbGestionnaires;
    }

    public ArrayList<GestionnaireAnimaux> getGestionnaires(){
        return gestionnaires;
    }

    public void addGestionnaire(GestionnaireAnimaux ga){
        gestionnaires.add(ga);
    }

    public void NouvelleSaison(){
        for(GestionnaireAnimaux ga : gestionnaires){
            ga.GererSaison();
        }
    }
}