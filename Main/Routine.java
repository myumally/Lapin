import lapin.*;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Routine{
    protected static int nbGestionnaires;
    protected static ArrayList<GestionnaireAnimaux> gestionnaires = new ArrayList<GestionnaireAnimaux>();

    public static int getNbGestionnaires(){
        return nbGestionnaires;
    }

    public static ArrayList<GestionnaireAnimaux> getGestionnaires(){
        return gestionnaires;
    }

    public static void addGestionnaire(GestionnaireAnimaux ga){
        gestionnaires.add(ga);
    }

    public void NouvelleSaison(){
        for(GestionnaireAnimaux ga : gestionnaires){
            ga.GererSaison();
        }
    }
}